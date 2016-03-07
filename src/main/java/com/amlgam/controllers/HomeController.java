package com.amlgam.controllers;

import com.amlgam.model.Subscriber;
import com.amlgam.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by dima on 07.03.16.
 */
@Controller
@RequestMapping("/")
public class HomeController
{
    private SubscriberRepository repository;

    @Autowired
    public HomeController(SubscriberRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap)
    {
        modelMap.addAttribute("subscriber", new Subscriber());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String insertData(ModelMap model,
                             @ModelAttribute("subscriber") @Valid Subscriber subscriber,
                             BindingResult result) {
        if (!result.hasErrors()) {
            repository.save(subscriber);
        }
        return index(model);
    }


}
