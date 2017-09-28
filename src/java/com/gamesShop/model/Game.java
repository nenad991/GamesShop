package com.gamesShop.model;
// Generated Aug 12, 2017 11:51:56 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Game generated by hbm2java
 */
@Entity
@Table(name="game"
    ,catalog="games_data"
)
public class Game  implements java.io.Serializable {


     private Integer gameId;
     private Availability availability;
     private GameNames gameNames;
     private GameType gameType;
     private Producer producer;
     private BigDecimal price;
     private String picture;
     private String description;

    public Game() {
    }

	
    public Game(Availability availability, GameNames gameNames, GameType gameType, Producer producer, BigDecimal price, String picture) {
        this.availability = availability;
        this.gameNames = gameNames;
        this.gameType = gameType;
        this.producer = producer;
        this.price = price;
        this.picture = picture;
    }
    public Game(Availability availability, GameNames gameNames, GameType gameType, Producer producer, BigDecimal price, String picture, String description) {
       this.availability = availability;
       this.gameNames = gameNames;
       this.gameType = gameType;
       this.producer = producer;
       this.price = price;
       this.picture = picture;
       this.description = description;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="game_id", unique=true, nullable=false)
    public Integer getGameId() {
        return this.gameId;
    }
    
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="availability_id", nullable=false)
    public Availability getAvailability() {
        return this.availability;
    }
    
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="game_names_id", nullable=false)
    public GameNames getGameNames() {
        return this.gameNames;
    }
    
    public void setGameNames(GameNames gameNames) {
        this.gameNames = gameNames;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="game_type_id", nullable=false)
    public GameType getGameType() {
        return this.gameType;
    }
    
    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="producer_id", nullable=false)
    public Producer getProducer() {
        return this.producer;
    }
    
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    
    @Column(name="price", nullable=false, precision=6)
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    
    @Column(name="picture", nullable=false, length=512)
    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }

    
    @Column(name="description", length=1024)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}

