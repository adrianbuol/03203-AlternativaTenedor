/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {
    
    public static final Locale LCL = new Locale("es", "ES");
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(LCL);
    
       public static void main(String[] args){
//            Variables
            String comida;
            String trespuas;
            String cuatropuas;
            String ceropuas;
            
//            Constantes
            final int tenedor = 4;
            final int tridente = 3;
            final int cuchara = 0;

           System.out.printf("Alternativa Tenedor%n");
           System.out.printf("===================%n");
           System.out.printf("Tipo de comida .: ");
           comida = SCN.nextLine();
           
           System.out.printf("---%n");
           
//           Declaracion de Switch
           switch (comida){
//             En caso de ser carne la respuesta dará la constante tridente.
               case "Carne": trespuas = "tridente";
                   System.out.printf("Tenedor con ....:%s púas.%n",tridente);
                       break;
               case "Pescado": cuatropuas = "tenedor";
                   System.out.printf("Tenedor con ....:%s púas.%n",tenedor);
                       break;
               case "Sopa": ceropuas = "cuchara";
                   System.out.printf("Tenedor con ....:%s púas.%n",cuchara);
                       break;
//             En caso de dar una respuesta no contemplada, dará esté mensaje generico.
             default: 
                 System.out.printf("Tenedor con ....:N/A púas.%n");
                      break;
           }
           
           
       }
}
