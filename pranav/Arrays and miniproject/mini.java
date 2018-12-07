public class mini 
{ 
    public static void main(String[] args) 
    { 
        
        String empDetail[][] = new String[7][]; 
 
        empDetail[0] = new String[]{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"}; 
		empDetail[1] = new String[]{"1002","Sushma","23/08/2012","c","PM","30000","4000","9000"};
		empDetail[2] = new String[]{"1003","Rahul","12/11/2008","k","Acct","10000","9000","1000"};
		empDetail[3] = new String[]{"1004","Chahat","29/01/2013","r","Desk","12000","6000","2000"};
		empDetail[4] = new String[]{"1005","Rajan","16/07/2005","m","Engg","50000","1500","20000"};
		empDetail[5] = new String[]{"1006","Suman","01/01/2000","e","MFG","23000","7000","4400"};
		empDetail[6] = new String[]{"1007","Tanmay","12/06/2006","c","PM","29000","3000","10000"};
		
		int index=-1;
		String choice =args[0];
		
		for (int i=0; i<empDetail.length; i++){ 
			for (int j=0; j<empDetail[i].length; j++){
				if(choice.equals(empDetail[i][j])){
					index=i;
				}
			}
		}
		//System.out.println(index);
		if(index!=-1){
		String dCode=empDetail[index][3];
		//System.out.println(dCode); 
		String Desg="";
		String DA="";
		
		switch(dCode){    
		case "e":    
		    Desg="Engineer";
			DA="20000";	
		break;   
		case "c":    
			Desg="Engineer";
			DA="20000";
		break;
		case "k":    
			Desg="Engineer";
			DA="20000";
		break;
		case "r":    
			Desg="Engineer";
			DA="20000";
		break;
		case "m":    
			Desg="Engineer";
			DA="20000"; 
		break;
		default:
			System.out.println("there is no employee with empId:"+dCode);
		break;
		}
		//Basic+HRA+DA-IT
		int sal=Integer.parseInt(empDetail[index][5])+Integer.parseInt(empDetail[index][6])+Integer.parseInt(DA)-Integer.parseInt(empDetail[index][7]);
		System.out.println("Emp No."+"\t"+"Emp Name"+"\t"+"Department"+"\t"+"Designation"+"\t"+"Salary"); 
		System.out.println(choice+"\t"+empDetail[index][1]+"\t"+empDetail[index][4]+"\t"+Desg+"\t"+sal); 
        }
		else{
			System.out.println("there is no employee with empId:"+args[0]);
		}
		 
    } 
} 