package aliyar.mostafa.project.objects.controller;

public enum Status {
    DELETE(false),UPDATE(true);
    private boolean status;
     Status (boolean status){
         this.status = status;
     }
     public boolean getStatus(){
         return status;
     }
}
