/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author DanyL
 */
public class Chat extends Animals{
    
    private String[] race;
    
    /**
     *
     */
    public Chat() {
        super();
    }

    /**
     *
     * @param prenom_Animals
     * @param cri_Animals
     */
    public Chat(String prenom_Animals, String cri_Animals) {
        super(prenom_Animals, cri_Animals);
    }

    /**
     *
     * @return
     */
    public String[] getRace() {
        return race;
    }

    /**
     *
     * @param race
     */
    public void setRace(String[] race) {
        this.race = race;
    }
    
    
    
}
