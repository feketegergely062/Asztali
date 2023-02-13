/*
* File: Cone.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1 N
* Date: 2023-02-13
* Github: https://github.com/feketegergely062/
* Licenc: GNU GPL
*/
 
public class Cone {
    public double calcVolume(double radius, double height){
        //ide n a képlet
        double volume = (1.0/3.0)* Math.pow(radius,2) * Math.PI * height;
        return volume;
    }
   
}