package com.example.projetecommerce2.controllers;
import com.example.projetecommerce2.entities.Commande;
import com.example.projetecommerce2.services.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
@AllArgsConstructor

public class CommandeController {

        private CommandeService commandeService;
        @RequestMapping("/createCommande")
        public String createCommande(){
            return"CreateCommande";
        }
        @RequestMapping("saveCommande")
        public String saveCommande(@ModelAttribute("commandeVue") Commande commandeController){
            Commande saveCommande = commandeService.saveCommande(commandeController);
            return "CreateCommande";
        }
        @RequestMapping("/commandeList")
        public String commandeList(ModelMap modelMap){
            List<Commande> commandesController =commandeService.getAllCommandes();
            modelMap.addAttribute("commandeVue", commandesController);
            return "CommandeList";
        }
        @RequestMapping("/deleteCommande")
        public String deleteCommande(@RequestParam("id") Long id, ModelMap modelMap) {
            commandeService.deleteCommandeById(id);
            return commandeList(modelMap);
        /*List<Etudiant> etudiantsController = etudiantService.getAllEtudiant();
        modelMap.addAttribute("etudiantVue", etudiantsController);
        return "EtudiantList";*/
        }
        @RequestMapping("/editCommande")
        public String editCommande(@RequestParam("id") Long id ,  ModelMap modelMap){
            Commande commandeController = commandeService.getCommandeById(id);
            modelMap.addAttribute("commandeView",commandeController);
            return "EditCommande";

        }

    }
