package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Zboruri;

import service.ZboruriService;

@Controller
public class ZboruriController {
    @Autowired
	private ZboruriService zboruriService;
	
    @RequestMapping("/index")
    public String setupForm(Map<String, Object> map){
    	Zboruri zboruri = new Zboruri();
    	map.put("zboruri",zboruri);
    	map.put("zboruriList", zboruriService.getAllZboruri());
    	return "zboruri";
    }
    
    @RequestMapping(value="/zboruri.do",method=RequestMethod.POST)
    public String doAction(@ModelAttribute Zboruri zboruri, BindingResult result, @RequestParam String action,Map<String, Object> map){
    	Zboruri zboruriResult = new Zboruri();
    	
    	switch(action.toLowerCase()){
    	
    	case "add":
    		zboruriService.add(zboruri);
    		zboruriResult = zboruri;
    		break;
    	case "edit":
    		zboruriService.edit(zboruri);
    		zboruriResult = zboruri;
    		break;
    	case "delete":
    		//zboruriService.delete(zboruri.getZboruriId());
    		zboruriService.delete(zboruri.getId());
    		zboruriResult = new Zboruri();
    		break;
    	case "search":
    	 //Zboruri searchedZboruri =	zboruriService.get(zboruri.getZboruriId());
    	 Zboruri searchedZboruri = zboruriService.getZboruri(zboruri.getId());
    		zboruriResult = searchedZboruri !=null ? searchedZboruri : new Zboruri();
    		break;
    	}
    	
    	
//    	if (action.equals("add")){
//    		zboruriService.add(zboruri);
//    		zboruriResult = zboruri;
//    	}
//    	else if (action.equals("edit")){
//    		zboruriService.edit(zboruri);
//    		zboruriResult = zboruri;
//    	}
//        else if (action.equals("delete")){
//        	zboruriService.delete(zboruri.getId());
//    		zboruriResult = new Zboruri();
//    	}
//        else if (action.equals("search") ){
//        	Zboruri searchedZboruri = zboruriService.getZboruri(zboruri.getId());
//     		zboruriResult = searchedZboruri !=null ? searchedZboruri : new Zboruri();
//    	}
    	map.put("zboruri", zboruriResult);
    	map.put("zboruriList", zboruriService.getAllZboruri());
    	
    	
    	return "zboruri";
    }
}
