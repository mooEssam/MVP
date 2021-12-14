package Ui;

import Models.Actor;

public class ActorPresenter  {
    Actorview actorview;

    public ActorPresenter(Actorview actorview) {
        this.actorview = actorview;
    }

    public Actor GetAcorFromDataBase(){
        return new Actor("Mimo","t he most incridable Action Actor");
    }

   public void GetActorName()
   {
       actorview.OnGetActorName(GetAcorFromDataBase().getActor_name());
   }
}
