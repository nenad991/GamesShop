
package com.gamesShop.controller;

import com.gamesShop.dao.GameDao;
import com.gamesShop.model.Game;
import com.gamesShop.model.GameType;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {
    @Autowired
    GameDao gameDao;
    
    @RequestMapping("/Store")
    public String store(ModelMap model)
    {
       List<Game>game= gameDao.findGames();
       List<GameType>gamet= gameDao.gameType();
       model.addAttribute("game", game);
       model.addAttribute("gamet", gamet);
        return byCategory(2,model);
    }
    @RequestMapping("/Store1")
    public String store1(ModelMap model)
    {
        List<Game>game=gameDao.findGames();
        List<GameType>gamet=gameDao.gameType();
        model.addAttribute("game", game);
       model.addAttribute("gamet", gamet);
        return byCategory1(2,model);
    }
     @RequestMapping("/{id}")
    public String byCategory(@PathVariable int id, ModelMap model) {
        List<GameType> gamet = gameDao.gameType();
        List<Game> game = gameDao.findById(id);
        model.addAttribute("gamet", gamet);
        model.addAttribute("game", game);
        return "Store";
    }
    @RequestMapping("/Store1/{id}")
    public String byCategory1(@PathVariable int id, ModelMap model) {
        List<GameType> gamet = gameDao.gameType();
        List<Game> game = gameDao.findById(id);
        model.addAttribute("gamet", gamet);
        model.addAttribute("game", game);
        return "StoreLoged";
    }
    @RequestMapping("/toCart/{id}")
    public String toBasket(@PathVariable int id,ModelMap model)
    {
        List<GameType> gamet = gameDao.gameType();
         model.addAttribute("gamet", gamet);
        Game game = gameDao.getById(id);
       
        model.addAttribute("game", game);
        return "toCart";
    }
 
    @RequestMapping("/live")
    public String live(HttpServletRequest request,ModelMap model)
    {
        
       List<Game>name= gameDao.liveSearch(request.getParameter("search"));
       
       model.addAttribute("name", name);
     
        return "Store";
    }
    @RequestMapping("/cart")
    public String cart()
    {
        return "cart";
    }
}
