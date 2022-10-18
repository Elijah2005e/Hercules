public class Zeus{
                public static void swim(){
                        System.out.print( "laps" );
                }
                public static void ocean(boolean highTide){
                          if(  highTide == true ){
                                ocean(false);
                                
                              }
                }
                public static void main(String[] args){
                          ocean(true);
                          swim();
                          
                          
                   }
                   
             }
                         