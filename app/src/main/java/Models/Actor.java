package Models;

public class Actor {
    String actor_name,actor_description;

    public Actor(String actor_name, String actor_description) {
        this.actor_name = actor_name;
        this.actor_description = actor_description;
    }

    public Actor() {
    }

    public String getActor_name() {
        return actor_name;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public String getActor_description() {
        return actor_description;
    }

    public void setActor_description(String actor_description) {
        this.actor_description = actor_description;
    }
}
