package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    
    public void letra() {
        //1. receber a letra digitad pelo usuario
        System.out.println("Informe uma Letra");
        String letra = sc.nextLine();
        //2. escolher o resultado referente a letra
        String tipoLetra=""; 
        switch(letra){
            case "a": ;
            case "e": ;
            case "i": ;
            case "o": ;
            case "u": tipoLetra="vogal";
            break;
            default:tipoLetra="consoante";
            break;
        }
        //3. mostrar o resultado para o usuario
        System.out.println(letra +" é uma "+tipoLetra);
                
    }

    public void mes() {
        //receber o nº do mês
        System.out.println("Informe o nº ref. ao Mês");
        int nMes = sc.nextInt();
        //selecionar o Mes a partir do nº
        String tipoMes = "";
        switch (nMes) {
                case 1: tipoMes="Jan";
                break;
                case 2: tipoMes="Fev";
                break;
                case 3: tipoMes="Mar";
                break;
                case 4: tipoMes="Abr";
                break;
                case 5: tipoMes="Mai";
                break;
                case 6: tipoMes="Jun";
                break;
                case 7: tipoMes="Jul";
                break;
                case 8: tipoMes="Ago";
                break;
                case 9: tipoMes="Set";
                break;
                case 10: tipoMes="Out";
                break;
                case 11: tipoMes="Nov";
                break;
                case 12: tipoMes="Dez";
                break;
        
            default: tipoMes= "Nº não Encontrado";
                break;
        }
        System.out.println(tipoMes);
    }
}
