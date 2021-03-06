package com.gamesShop.model;
// Generated Aug 12, 2017 11:51:56 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * GameType generated by hbm2java
 */
@Entity
@Table(name="game_type"
    ,catalog="games_data"
)
public class GameType  implements java.io.Serializable {


     private Integer gameTypeId;
     private String typeName;
     private Set<Game> games = new HashSet<Game>(0);

    public GameType() {
    }

	
    public GameType(String typeName) {
        this.typeName = typeName;
    }
    public GameType(String typeName, Set<Game> games) {
       this.typeName = typeName;
       this.games = games;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="game_type_id", unique=true, nullable=false)
    public Integer getGameTypeId() {
        return this.gameTypeId;
    }
    
    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    
    @Column(name="type_name", nullable=false, length=45)
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="gameType")
    public Set<Game> getGames() {
        return this.games;
    }
    
    public void setGames(Set<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return  typeName;
    }




}


