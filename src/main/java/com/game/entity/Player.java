package com.game.entity;

import com.sun.istack.NotNull;
import jakarta.persistence.*;

import java.util.Date;

@NamedQuery(name = "Player_getAllCount",
query = "select count(p) from Player p")
@Entity
@Table(name = "player", schema = "rpg")
public class Player {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "race")
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private Race race;

    @Column(name = "profession")
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private Profession profession;

    @Column(name = "birthday")
    @NotNull
    private Date birthday;

    @Column(name = "banned")
    @NotNull
    private Boolean banned;

    @Column(name = "level")
    @NotNull
    private Integer level;

    public Player() {
    }

    public Player(Long id, String name, String title, Race race, Profession profession, Date birthday, Boolean banned, Integer level) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.birthday = birthday;
        this.banned = banned;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}