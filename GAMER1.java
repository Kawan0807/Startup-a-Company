import java.util.Scanner;
/**
 *
 * @author kawan
 */
public class GAMER1 {
    static String imagem;
    static String imagem(String imagem){
        String f;
        
        imagem =  "";
                System.out.println("     ####################################################################################### ");
                System.out.println("     ####################################################################################### ");
                System.out.println("     ####################################################################################### ");
                System.out.println("     #                                                                                     # ");
                System.out.println("     #         *********                                                     *********     # ");
                System.out.println("     #         *       *                                                     *       *     # ");
                System.out.println("     #         *       *                                                     *       *     # ");
                System.out.println("     #         *       *                                                     *       *     # ");
                System.out.println("     #         *       *                                                     *       *     # ");
                System.out.println("     #         *********                                                     *********     # ");
                System.out.println("   #####                                     &&&&&&&&&&&                                   ##### ");
                System.out.println("  #  #                                       &&&&&&&&&&&                                     #  # ");
                System.out.println("  #  #                                       &&&&&&&&&&&                                     #  # ");
                System.out.println("  #  #                                       &&  &&&  &&                                     #  # ");
                System.out.println("  #  #                                       &&  &&&  &&                                     #  # ");
                System.out.println("   #####                                     &&  &&&  &&                                   ##### ");
                System.out.println("     #                                                                                     # ");
                System.out.println("     #                                                                                     # ");
                System.out.println("     #              ==========================================================             # ");
                System.out.println("     #             |     |      |      |     |     |    |     |     |    |    |            # ");
                System.out.println("     #             |--------------------------------------------------------- |            # ");
                System.out.println("     #             |     |      |      |     |     |    |     |     |    |    |            # ");
                System.out.println("     #              ==========================================================             # ");
                System.out.println("     #                                                                                     # ");
                System.out.println("     #              !! SUA ID??IA N??O NOS AJUDOU, TENTE NOVAMENTE !!                        # ");
                System.out.println("     #                                                                                     # ");
                System.out.println("     ####################################################################################### ");
                
        
            f = imagem;
            
            return f;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int escolha;
            int sair = 4;
            do {
                System.out.println(" ");
                System.out.println(" <<<<< STARUP A COMPANY >>>>");
                System.out.println("");
                System.out.println("_______________________________________________");
                System.out.println("||___________________________________________||");
                System.out.println("||                                           ||");
                System.out.println("|| (1) Instru????es.                           ||");
                System.out.println("|| (2) Jogar.                                ||");
                System.out.println("|| (3) Cr??ditos.                             ||");
                System.out.println("|| (4) Sair.                                 ||");
                System.out.println("||                                           ||");
                System.out.println("|| Digite o n??mero de uma op????es desejadas:  ||");
                System.out.println("||___________________________________________||");
                System.out.println("||___________________________________________||");
                escolha = entrada.nextInt();
                
                switch(escolha){
                    case 1:
                        System.out.println(" _____________________________________________________________________________________________________________________________________________________");
                        System.out.println("|                                                                                                                                                     |");
                        System.out.println("  No jogo Startup a Company temos como objetivo introduzir voc?? jogador em uma hist??ria fict??cia utilizando o nome da empresa Ubride como base para"
                                         +  "\n" +
                                           "  compreender a hist??ria, voc?? encontrar?? situa????es de fundamentos de administra????o e realizar?? escolhas antes da startup Ubride entrar no mercado. " +
                                           "\n" +
                                           "  No jogo as escolhas deveram ser feitas com o n??mero 1 representando a (1?? primeira) alternativa, o n??mero 2 para a (2?? segunda) alternativa, o "
                                         +  "\n" +
                                           "  n??mero 3 para a (3?? terceira)  alternativa e o n??mero 4 para a (4?? quarta) alternativa. " +
                                           "\n" +
                                           "  Voc?? ter?? 2 tentativas para passar para a pr??xima fase. Caso erre 2 vezes, ter?? que come??ar o jogo na primeira fase. ");
                        System.out.println("|______________________________________________________________________________________________________________________________________________________|");
                        
                        break;
                    case 2:
                        
                        int i = 1;
                        int fase1 ;
                        String nome[]= new String[1];
                        System.out.println("Digite o seu nome: ");
                        nome[0] = entrada.next();
                        
                        do{
                        System.out.println("Ol?? " + nome[0] + " voc?? ?? um consultor(a) de neg??cios e foi contratado pelo  Steve  e N??colas para orientar-los a colocarem sua  Startup no mercado.");
                    System.out.println(" _____________________________________________________________________________________________________________________________________________________");
                    System.out.println("|                                                                                                                                                     |");
                    System.out.println("  Em 2019 na B??lgica dois alunos Steve e N??colas rec??m formados em TI decidem come??ar uma empresa e tiveram uma ideia inovadora, montar uma Startup"
                                     + "\n"
                                     + "  cujo o objetivo ?? unir pessoas que querem ir para outros lugares com pessoas que podem leva-las para o lugar desejado. "
                                     + "\n" 
                                     + "  Eles deram o nome de Ubride, desenvolveram um aplicativo capaz  de lucrar e fazer com que os motoristas ganham dinheiro pelo App.");
                    System.out.println("|______________________________________________________________________________________________________________________________________________________|");
                    System.out.println("");
                    System.out.println(" ______________________________________________________________________________________________________________");
                    System.out.println("| Ol?? " + nome[0] + " n??o sabemos como iniciar a empresa Ubride no mercado e finalmente lucrar com o nosso App. |");
                    System.out.println("|______________________________________________________________________________________________________________|");
                    System.out.println("");
                    System.out.println("<1> Planejamento \n" +
                                       "<2> Buscar investimento\n" +
                                       "<3> Contratar funcion??rios \n" +
                                       "<4> Comprar um escrit??rio");
                    System.out.println("");
                    System.out.println("Por favor nos ajude, de qual maneira podemos come??ar:");
                                    
                     fase1 = entrada.nextInt();
                                           
                    switch(fase1){
                        
                        case 1: System.out.println("");
                                System.out.println("*******************************************************************************************************************************************************");
                                System.out.println("* Obrigado " + nome[0] + " excelente ideia !                                                                                                             *"); 
                                System.out.println("* O planejamento ?? uma ferramenta de gest??o empresarial que esta contribuindo para desenharmos  os caminhos para que alcancemos o nosso objetivo,     *"
                                                  +"\n"
                                                  +"* antecipando os poss??veis cen??rios.                                                                                                                  *");
                                System.out.println("*******************************************************************************************************************************************************");             
                                System.out.println(""); 
                        int b = 1;
                        int fase2;
                        do{
                                System.out.println(" _______________________________________________________________________________________________________________");
                                System.out.println("| O Steve e N??colas ap??s desenvolverem um planejamento,                                                      | " 
                                                    +"\n"+
                                                    " acreditam que  precisam descobrir quais s??o os pontos necess??rios para colocar a empresa Ubride no mercado." 
                                                    +"\n"+
                                                    "|______________________________________________________________________________________________________________|" + 
                                                    "\n" +    
                                                    "<1> Pesquisa empresas concorrente." + "\n"+
                                                    "<2> Realizar uma an??lise SWOT( for??a, oportunidade, fraqueza e amea??a)." +"\n"+
                                                    "<3> Pesquisa de Marketing." +"\n"+
                                                    "<4> Pesquisa  os gastos da empresa.");
                                System.out.println("");
                                System.out.println(nome[0] + " aplicando qual m??todo conseguimos descobrir? ");
                                 fase2 = entrada.nextInt();
                        
                    switch(fase2){
                        
                            case 1:                              
                                String r1 = imagem(imagem); 
                                System.out.println(r1);break;
                    
                            case 2: 
                                System.out.println("");
                                System.out.println("****************************************************************************************************************************************");   
                                System.out.println("* Obrigado " + nome[0] + " excelente ideia !                                                                                              *");
                                System.out.println("* An??lise SWOT ?? uma ferramenta de gest??o que est?? nos ajudando a fazer o planejamento estrat??gico da empresa e novos projetos.        *" +
                                                   "\n" +
                                                   "* A sigla SWOT significa: Strengths (For??as), Weakness (Fraquezas), Opportunities (Oportunidades) e Threats (Amea??as) e tamb??m,        *"
                                        
                                           + "\n" +"* ?? conhecida como An??lise FOFA ou Matriz SWOT.                                                                                        *");
                                System.out.println("****************************************************************************************************************************************");             
                         
                                System.out.println("                                                                         ");
                                int c = 1;
                                int fase3;
                                do{
                                System.out.println(" __________________________________________________________________________________________________________________________________________________");
                                System.out.println("| Steve e N??colas estavam em um parque conversando sobre como ser?? as fun????es dos colaborados na empresa Ubride, m??s n??o sabe como fazer isso.     |");
                                System.out.println("|__________________________________________________________________________________________________________________________________________________|");                         
                                
                                System.out.println("");
                                System.out.println("<1> Contratar mais um s??cio. " +"\n"+
                                                   "<2> Descrever cargos." + "\n" +
                                                   "<3> Planejamento." + "\n" +
                                                   "<4> Estrutura organizacional.");
                                System.out.println("");
                                System.out.println(nome[0] + " o que precisamos fazer para distinguir as fun????es que ter??o na empresa, utilizar qual metodologia da administra????o? ");
                                fase3 = entrada.nextInt();
                            
                            switch(fase3){
                                
                                case 1:

                                    String r2 = imagem(imagem); 
                                    System.out.println(r2);break;
                                
                                case 2:
                                    
                                    String r3 = imagem(imagem); 
                                    System.out.println(r3);break;                                  
                               
                                case 3:
                                    String r4 = imagem(imagem); 
                                    System.out.println(r4);break;

                    
                                case 4:
                                    System.out.println("");
                                    System.out.println("******************************************************************************************************************************************");    
                                    System.out.println("* Obrigado " + nome[0] + " excelente ideia!                                                                                                 *");
                                    System.out.println("* A estrutura organizacional ?? um conceito que realmente nos  ajudou a organizada em torno da divis??o de atividades e recursos com fins, * "
                                               +"\n" + "* de cumprir os nossos objetivos.                                                                                                        *");  
                                    System.out.println("******************************************************************************************************************************************");             

                                System.out.println("                                                                         ");      
                                int d = 1;
                               int fase4;
                                  
                                 do{
                                   
                                 
                                System.out.println(" ________________________________________________________________________________________________________________________________________________________");                            
                                System.out.println("| Ol?? " + nome[0] + ", eu conversei com o Steve e n??s queremos desenvolver uma apresenta????o do que a empresa Ubride ir?? representar tanto para os seus,  |"
                                           + "\n"+ "| colaborados quanto para os seus clientes e despertar interesse em novas pessoas, por??m n??o sabem como criar essa imagem para a empresa.                |");
                                System.out.println("|________________________________________________________________________________________________________________________________________________________|");
                                System.out.println("");
                                System.out.println("<1> Contratar uma equipe de Marketing." + "\n" +
                                                   "<2> Criar uma Miss??o, vis??o e valores." + "\n" +
                                                   "<3> Estrutura organizacional." + "\n" +
                                                   "<4> Elaborar plano financeiro.");    
                                System.out.println("");
                                System.out.println(nome[0] + " como podemos criar isto? ");
                                
                                fase4 = entrada.nextInt();
                                
                                switch(fase4){
                                    case 1: 
                                        String r5 = imagem(imagem); 
                                        System.out.println(r5);break;
                    
                                    case 2:
                                        System.out.println("");
                                        System.out.println("************************************************************************************************************************************************************");
                                        System.out.println("* Obrigado "+ nome[0] + " excelente ideia!                                                                                                                    *");
                                        System.out.println("* Steve e N??colas a miss??o ?? tida como o detalhamento da raz??o de ser da empresa, ou seja, ?? o porqu?? da empresa. A vis??o ?? algo respons??vel,              *"
                                                  + "\n" + "* por nortear a organiza????o. Os \"valores\" incidem nas convic????es que fundamentam as escolhas por um modo de conduta tanto de um indiv??duo quanto,        *"
                                                  + "\n" + "* em uma organiza????o, sendo assim , os valores organizacionais podem ser definidos como princ??pios que guiam a vida da organiza????o.                        *");
                                        System.out.println("************************************************************************************************************************************************************");             

                                        System.out.println("                                                                         "); 
                                        int e = 1 ;
                                        int fase5;
                                        
                                        do{
                                        System.out.println(" ____________________________________________________________________________________________________________________________________________");
                                        System.out.println("| " + nome[0] + " conseguimos planejar como ser?? a empresa, descobrir quais s??o os nossos pontos fortes, fraquezas, amea??as e oportunidades,  |"
                                                  + "\n" + " estruturar as fun????es na empresa, constru??mos nossa miss??o, vis??o e valores. M??s precisamos de investimento para, "
                                                  + "\n" + " colocar a empresa no mercado.");
                                        System.out.println("|____________________________________________________________________________________________________________________________________________|");
                                        System.out.println("");
                                        System.out.println("<1> Procurar investimento anjo, apresentar a empresa e seu aplicativo." + "\n" +
                                                           "<2> Montar um plano de financiamento." + "\n" +
                                                           "<3> Estrutura organizacional." + "\n" +
                                                           "<4> Planejamento.");
                                        System.out.println("");
                                                                                                                
                                        System.out.println("Como conseguimos isso " + nome[0] + "? ");
                                        fase5 = entrada.nextInt();
                                        
                                    switch(fase5){
                                        case 1:
                                            System.out.println("");
                                            System.out.println("***********************************************************************************************************************************************************************");
                                            System.out.println("* Obrigado "+ nome[0] + " excelente ideia!                                                                                                                               *");
                                            
                                            System.out.println("* O investimento Anjo ?? o investimento efetuado por pessoas f??sicas com seu capital pr??prio em empresas nascentes com alto potencial de crescimento, (as startups).   *");
                                            System.out.println("* Conseguimos um investidor !!! Agora n??s podemos iniciar a empresa Ubride no mercado,                                                                                *"
                                                      + "\n" + "* realizamos todos os pontos necess??rios para realizar o nosso sonho e objetivo !!!!!!!!!                                                                             *");
                                            System.out.println("***********************************************************************************************************************************************************************");             

                                             System.out.println("                ");
                                             System.out.println("      @@        @@     ");
                                             System.out.println("     @@@@      @@@@     ");
                                             System.out.println("    @@@@@@    @@@@@@     ");
                                             System.out.println("   @@@@@@@@  @@@@@@@@    ");
                                             System.out.println("    @@@@@@    @@@@@@     ");
                                             System.out.println("     @@@@      @@@@      ");
                                             System.out.println("      @@        @@        ");
                                             System.out.println("     @@        @@         ");
                                             System.out.println("    //        //          ");
                                             System.out.println("   //        //           ");
                                             System.out.println(" ___________");
                                             System.out.println("|__|__|__|__| ");
                                             System.out.println("|__|__|__|__| ");
                                             System.out.println("|__|__|__|__| ");
                                             System.out.println("|__|__|__|__| ");
                                             System.out.println("|__|__|__|__| ");
                                             System.out.println("|__|__|__|__| ");
                                             System.out.println("|__??__|__??__| ### PARAB??NS! ###");
                                             System.out.println("                               ");
                                             System.out.println("Obrigado " + nome[0] + ", voc?? ?? fant??stico!!!!!!!!!");
                                             break;
                                               

                                        case 2:
                                            
                                            String r6 = imagem(imagem); 
                                            System.out.println(r6);break;
                                            
                                        case 3:  
                                            String r7 = imagem(imagem); 
                                            System.out.println(r7);break;
               
                                        case 4:
                                          
                                           String r8= imagem(imagem); 
                                           System.out.println(r8);break;
                                           
                                        default:
                                            System.out.println("((( =>=>=>=> Op????o inv??lida! <=<=<=<= )))");break;
                                       }
                                            e++;
                                    }while((fase5!=1)&&(e<=2)); 
                        
                                        if((fase5!=1)){
                                                System.out.println("####################################");
                                                System.out.println("##   GAME OVER - START THE GAME   ## ");
                                                System.out.println("####################################");
                                                }
                        
                                          break;
                                          
                                    case 3:
                                        
                                        String r9 = imagem(imagem); 
                                        System.out.println(r9);break;
                                        
                                    case 4: 
                                        String r10 = imagem(imagem); 
                                        System.out.println(r10);break;
                                    
                                    default: 
                                        System.out.println("((( =>=>=>=> Op????o inv??lida! <=<=<=<= )))");
                                }
                                d++;  
                                }while((fase4!=2)&&(d<=2)); 
                                 
                                    if((fase4!=2)){
                                         System.out.println("####################################");
                                         System.out.println("##   GAME OVER - START THE GAME   ## ");
                                         System.out.println("####################################");
                                         }
                                 
                                 
                        
                        break;
                                
                                default: 
                                    System.out.println("((( =>=>=>=> Op????o inv??lida! <=<=<=<= )))");
                            
                              
                                 }
                                 c++;       
                                 
                        }while((fase3!=4)&&(c<=2)); 
                                if((fase3!=4)){
                        System.out.println("####################################");
                        System.out.println("##   GAME OVER - START THE GAME   ## ");
                        System.out.println("####################################");
                        }
                        
                        break;
                            
                            case 3:
                                
                                String r11 = imagem(imagem); 
                                System.out.println(r11);break;                                     
                      
                            case 4:
                                
                                String r12 = imagem(imagem); 
                                System.out.println(r12);break;
                                
                            default: 
                                
                                System.out.println("((( =>=>=>=> Op????o inv??lida! <=<=<=<= )))"); break;
                        }
                         b++;       
                        }while((fase2!=2)&&(b<=2)); 
                        if((fase2!=2)){
                        System.out.println("####################################");
                        System.out.println("##   GAME OVER - START THE GAME   ## ");
                        System.out.println("####################################");
                        }
                        
                        break;                
                        
                        case 2:       
                               String r13 = imagem(imagem); 
                                System.out.println(r13);break;    
                        case 3:
                                String r14 = imagem(imagem); 
                                System.out.println(r14);break;
                        case 4:
                                String r15 = imagem(imagem); 
                                System.out.println(r15);break;
                                 
                        default:
                                 System.out.println("((( =>=>=>=> Op????o inv??lida! <=<=<=<= )))");break;
                                  
                              
                    }
                    i++;
                              
                        
                        }while((fase1!=1)&&(i<=2)); 
                        
                        
                        if((fase1!=1)){
                        System.out.println("####################################");
                        System.out.println("##   GAME OVER - START THE GAME   ## ");
                        System.out.println("####################################");
                        }
                        break;                
                        
                        
                    case 3: 
                        System.out.println("Desenvolvedor = Kawan Melo Fernandes ");break;
                        
                    case 4:
                        System.out.println("Fim de jogo! ");break;
                     
                    default:
                        System.out.println("((( =>=>=>=> Op????o inv??lida! <=<=<=<= )))");break;
                        
                        
                }
                
            } while (escolha!= sair);
        }
        
    
}
