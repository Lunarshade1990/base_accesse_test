package com.lunarshade.test.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "owners")
public class Owner {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "owners_id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "tesera_nick")
    private  String teseraNickname;

    @Column(name = "telegram")
    private String telegram_ref;

    @Column(name = "vk")
    private String vk_ref;


    @ManyToMany
    @JoinTable(name = "games_owners",
                joinColumns = @JoinColumn(name = "owner_id", referencedColumnName = "owners_id"),
                inverseJoinColumns = @JoinColumn(name = "game_id", referencedColumnName = "games_id")
    )
    private Set<Game> games;

    public Owner() {
    }

    public Owner(Integer id, String name, String teseraNickname, String telegram_ref, String vk_ref) {
        this.id = id;
        this.name = name;
        this.teseraNickname = teseraNickname;
        this.telegram_ref = telegram_ref;
        this.vk_ref = vk_ref;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeseraNickname() {
        return teseraNickname;
    }

    public void setTeseraNickname(String teseraNickname) {
        this.teseraNickname = teseraNickname;
    }

    public String getTelegram_ref() {
        return telegram_ref;
    }

    public void setTelegram_ref(String telegram_ref) {
        this.telegram_ref = telegram_ref;
    }

    public String getVk_ref() {
        return vk_ref;
    }

    public void setVk_ref(String vk_ref) {
        this.vk_ref = vk_ref;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
