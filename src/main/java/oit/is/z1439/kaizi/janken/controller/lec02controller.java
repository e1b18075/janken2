package oit.is.z1439.kaizi.janken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1439.kaizi.janken.model.Janken;

@Controller
public class Lec02Controller {

  /**
   * lec02というGETリクエストがあったら，lec02()を呼び出して，lec02.htmlを返すメソッド
   *
   * @return
   */

  @GetMapping
  public String lec02() {
    return "lec02.html";
  }

  @Autowired

  @GetMapping("/Login")
  public String Login(@RequestParam Integer jankenhand, ModelMap model) {
    Janken hand = new Janken(jankenhand);
    model.addAttribute("jankenhand", hand.playerhand());
    model.addAttribute("cpuhand", hand.cpuhand());
    model.addAttribute("score", hand.score());
    return "lec02.html";
  }

  @PostMapping
  public String lec02(@RequestParam String username, ModelMap model) {
    model.addAttribute("username", username);
    return "lec02.html";
  }
}
