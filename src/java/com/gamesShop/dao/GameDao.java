package com.gamesShop.dao;

import com.gamesShop.model.Game;
import com.gamesShop.model.GameNames;
import com.gamesShop.model.GameType;
import com.gamesShop.model.Producer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GameDao {

    public List<Game> findGames() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Game> list = session.createCriteria(Game.class).list();
        tx.commit();

        return list;
    }

    public List<GameType> gameType() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<GameType> list = session.createCriteria(GameType.class).list();
        tx.commit();

        return list;
    }
public Game getById(int id)
     {
          Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Game game = (Game)session.get(Game.class, id);
        tx.commit();
        return game;
     }
    public List<Game> findById(int gamet) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        GameType gt = (GameType) session.get(GameType.class, gamet);
        Query query = session.createQuery("from Game where gameType =:gt");
        query.setParameter("gt", gt);
        List<Game> result = (List<Game>) query.list();
        tx.commit();

        return result;
    }
    public List<Game> liveSearch(String gn)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
         Query query = session.createQuery("from Game where description like :gn");
         query.setParameter("gn", "%"+gn);
          List<Game> list = (List<Game>) query.list();
        tx.commit();

        return list;
    }
}
