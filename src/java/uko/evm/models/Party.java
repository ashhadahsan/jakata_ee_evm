/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uko.evm.models;

/**
 *
 * @author ashhad
 */
public class Party {
    private int id;
    private int customOrder;
    private String name;
    private String alias;
    private boolean isPartylist;

    private int votes;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCustomOrder() {
        return customOrder;
    }
    public void setCustomOrder(int customOrder) {
        this.customOrder = customOrder;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isPartylist() {
        return isPartylist;
    }
    public void setPartylist(boolean isPartylist) {
        this.isPartylist = isPartylist;
    }

    public int getVotes() {
        return votes;
    }
    public void setVotes(int votes) {
        this.votes = votes;
    }
}