class Patient{
    private String fName;
    private String disease;
    private String cure;
    private int room;
     
     Patient( 
     String fName, 
     String disease,
     String cure,
     int room){
     this.fName = fName;
     this.disease = disease;
     this.cure = cure;
     this.room = room;
         
     }
     void setN(String fName){
        this.fName = fName;
     }
     void setD(String disease){
         this.disease = disease;
     }
     void setC(String cure){
         this.cure = cure;
     }
     void setR(int room){
       this.room = room;
     }
     String getN(){
         return fName;
     }
     String getD(){
         return disease;
     }
     String getC(){
         return cure;
     }
     int getR(){
         return room;
     }
     
     
 }
