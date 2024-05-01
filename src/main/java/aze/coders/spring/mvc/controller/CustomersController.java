package aze.coders.spring.mvc.controller;

import aze.coders.spring.mvc.entity.Customers;
import aze.coders.spring.mvc.service.CustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomersController {
    private final CustomersService customersService;

    @GetMapping
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", customersService.findAll());
        System.out.println(customersService.findAll());
        return "customers";
    }

    @GetMapping("/update/{id}")
    public String getCustomerForUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customersService.findById(id));
        return "customer-update";
    }

    @GetMapping("/save")
    public String getCustomerForSave() {
        return "customer-save";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Customers customers) {
        customersService.update(customers);
        return "redirect:/customers";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute Customers customers) {
        System.out.println("customers: " + customers);
        customersService.save(customers);
        return "redirect:/customers";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
//    @PostMapping("/delete")
    public String deleteCustomers(@PathVariable Integer id) {
        customersService.delete(id);
        return "redirect:/customers";
    }

    @GetMapping("/name")
    public String getCustomersByName(@RequestParam String name, Model model) {
        model.addAttribute("customers", customersService.findByName(name));
        System.out.println(customersService.findAll());
        return "customers";
    }
    //parameters (path variable controller)
    //url set previous url
}