package myspring.controller;

import myspring.model.Blydo;
import myspring.service.BlydoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlydoController {
    private BlydoService blydoService;

    @Autowired(required = true)
    @Qualifier(value = "blydoService")
    public void setBlydoService(BlydoService blydoService) {
        this.blydoService = blydoService;
    }

    @RequestMapping(value = "blyda", method = RequestMethod.GET)
    public String listBlyd(Model model){
        model.addAttribute("blydo", new Blydo());
        model.addAttribute("listBlyd", this.blydoService.listBlyd());

        return "blyda";
    }

    @RequestMapping(value = "/blyda/add", method = RequestMethod.POST)
    public String addBlydo(@ModelAttribute("blydo") Blydo blydo){
        if(blydo.getIdblydo() == 0){
            this.blydoService.addBlydo(blydo);
        }else {
            this.blydoService.updateBlydo(blydo);
        }

        return "redirect:/blyda";
    }

    @RequestMapping("/blydoremove/{id}")
    public String removeBlydo(@PathVariable("id") int id){
        this.blydoService.removeBlydo(id);

        return "redirect:/blyda";
    }

    @RequestMapping("blydoedit/{id}")
    public String editBlydo(@PathVariable("id") int id, Model model){
        model.addAttribute("blydo", this.blydoService.getBlydoById(id));
        model.addAttribute("listBlyd", this.blydoService.listBlyd());

        return "blyda";
    }

    @RequestMapping("blydodata/{id}")
    public String blydoData(@PathVariable("id") int id, Model model){
        model.addAttribute("blydo", this.blydoService.getBlydoById(id));

        return "blydodata";
    }
}
