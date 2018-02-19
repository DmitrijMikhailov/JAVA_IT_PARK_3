package ru.itpark.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.news.forms.RegistrationForm;
import ru.itpark.news.services.RegistrationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegistrationController {

  @Autowired
  private RegistrationService service;

  @PostMapping("/registration")
  public String registrationUser(@ModelAttribute RegistrationForm form,
                                 @ModelAttribute("model") ModelMap model) {
    String email = service.registration(form);
    model.addAttribute("email", email);
    return "success";
  }

  @GetMapping("/registration")
  public String getRegistrationPage() {
    return "registration_page";
  }

  @GetMapping("/confirm/{confirm-string}")
  public String getConfirmPage(
      @ModelAttribute("model") ModelMap model,
      @PathVariable("confirm-string") String confirmString) {
    boolean result = service.confirm(confirmString);
    model.addAttribute("result", result);
    return "confirm_result_page";
  }

  @GetMapping("/login")
  public String login(
      @ModelAttribute("model") ModelMap model,
      @RequestParam(value = "error", required = false) Boolean error) {
    if (error != null) {
      model.addAttribute("error", true);
    } else {
      model.addAttribute("error", false);
    }
    return "login";
  }
  @RequestMapping(value="/logout", method = RequestMethod.GET)
  public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null){
      new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    return "redirect:/login?logout";
  }
}
