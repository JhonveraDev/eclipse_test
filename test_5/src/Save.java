import javax.swing.JOptionPane;
import java.util.Scanner;
public class Save {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	 /*
	 ---------------------------------------------------
	++Sum 3 Notes of students and compute the average
	+Scanner
	+While
		  
		  float $a,$b,$c,$resultado;
		int f=0,$estu,cont=0;
		
		
		System.out.println("¿Cuantas Alumnos son?");
		Scanner $ins= new Scanner(System.in);
		$estu= $ins.nextInt();
		
		
		while (cont<$estu){
			System.out.println("Digite su Nota");
		
			 
			 $a= $ins.nextFloat();
			 $b= $ins.nextFloat();
			 $c= $ins.nextFloat();
			 cont++;
			 
			 $resultado=($a+$b+$c)/3;
			 
			 System.out.println("El resultado del alumno "+ cont + "es: "+$resultado );
	}
		System.out.println("Fin de la Digitación");
		
		
	 ---------------------------------------------------
		 
	*/
	
		
	/*
	 ---------------------------------------------------
	++Pay of an employee for hours.
		
		
	Double $salario_hora,$horas_trabajadas;
	String $nombre;
		
$nombre=JOptionPane.showInputDialog("Escriba el Nombre del Empleado");


$horas_trabajadas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas Horas ha trabajado? "));	 
$salario_hora=Double.parseDouble(JOptionPane.showInputDialog("Digite Cuanto es el salario por Hora de "+ $nombre));

$salario_hora=$horas_trabajadas*$salario_hora;

JOptionPane.showMessageDialog(null, "El suldo total por las horas trabajadas es de: "+$salario_hora);

	 ---------------------------------------------------
	
	 */
 
    /*	
	---------------------------------------------------	
	 
	 
	 
	int $nDollars,$luis,$juan,$total;
	
	
	$nDollars= Integer.parseInt(JOptionPane.showInputDialog(null, "Type quantity of Dollars"));
	$luis=($nDollars/2);
	$juan=($nDollars+$luis)/2;
	
	JOptionPane.showMessageDialog(null,"Luis Have "+$luis+" USD");
	JOptionPane.showMessageDialog(null,"Juan Have "+$juan+" USD");		  
		
	$total=$nDollars+$luis+$juan;
	
	JOptionPane.showMessageDialog(null,"Total between in the Three "+$total+" USD");
		
		---------------------------------------------------	
	
     	*/
	
		/* 
		---------------------------------------------------	
	  	++its okay if the value the cars is the same
		
		 
		JOptionPane.showMessageDialog(null,"Welcome to MOTOR'S");
		
		
		float $salary=1000,$commission=150,$valueSale,$pay;
		int $quantityCar;
		
		$valueSale=Integer.parseInt(JOptionPane.showInputDialog("Type value of Sale"));
		$quantityCar= Integer.parseInt(JOptionPane.showInputDialog("Type the lot of car sold"));
		
		float $carMonth = $quantityCar*$valueSale;
		
		float $extra=($carMonth*($valueSale*5)/100);
		System.out.println($extra);
		
		$pay=$salary+$commission+$extra;
		
		JOptionPane.showMessageDialog(null,"Total to Pay is in the month "+ $pay);
	
		----------------------------------------------
		*/
	
		/*
		----------------------------------------------
	 	++Note of an Student with percent specific in the phase of notes. 
		
	
		
		float $percentPar,$percentFE,$percentSE,$percentEF;
		float $participation,$firstExam,$secondExam,$finalExam,$sumNote;
		String $nameStudent;
		
		$nameStudent=JOptionPane.showInputDialog(null, "Name of Student");
		
		
		Scanner $escannote= new Scanner(System.in);
		
		//----------------------------------------------
		System.out.println("Note of Participation");
		$participation= $escannote.nextFloat();
		//-----------------------------------------------
		System.out.println("Note of first exam");
		$firstExam= $escannote.nextFloat();
		//-----------------------------------------------
		System.out.println("Note of second exam");
		$secondExam= $escannote.nextFloat();
		//-----------------------------------------------
		System.out.println("Note of final exam");
		$finalExam= $escannote.nextFloat();
		
		$sumNote =$participation+$firstExam+$secondExam+$finalExam;
		
		$percentPar=($sumNote*10)/100;
		$percentFE=($sumNote*25)/100;
		$percentSE=($sumNote*25)/100;
		$percentEF=($sumNote*40)/100;
		
		float $finalNote= ($percentPar+$percentFE+$percentSE+$percentEF)/4;
		
		JOptionPane.showMessageDialog(null, "The Note of "+$nameStudent+" is of "+ $finalNote);
		
		float $great=4;
		
		
		if($finalNote>=$great) {
			JOptionPane.showMessageDialog(null,"Great, good work!!");
			
			
		}else {
			
			JOptionPane.showMessageDialog(null,"could to get better your Notes,Cheer UP!! ");
		}
		
		
		----------------------------------------------
	
		
		*/
		
		/*
		----------------------------------------------
		code of a program that calculate the square of a sum

		
		//(x)E2 + 2.(x).(y) + (y)E2
		
		
		int x,y,x1,y1;
		
		Scanner $scan= new Scanner(System.in);
		
		System.out.println("Type value of 'X'");
		x=$scan.nextInt();
		
		System.out.println("Type value of 'Y'");
		y=$scan.nextInt();
		
		//--------------------------------
		x1 = (int) Math.pow(x, 2);
		y1= (int) Math.pow(y, 2);
		//--------------------------------
		int $mult=((2*x)*y);
		
		JOptionPane.showMessageDialog(null, "Answer: ("+x1+"X"+")E2"+" + "+ $mult +"XY"+" + " +"("+ y1+"Y"+")E2");
		System.out.println("Answer: ("+x1+"X"+")E2"+" + "+ $mult +"XY"+" + " +"("+ y1+"Y"+")E2");
		//-----------------------------------
		
		
		----------------------------------------------
		*/
		
		/*
		----------------------------------------------
		Number multiples
		 
		int $num1,$num2,$total;
		
		$num1= Integer.parseInt(JOptionPane.showInputDialog("Type Number "));
		$num2= Integer.parseInt(JOptionPane.showInputDialog("Type Number "));
		
		int $mod=$num1 % $num2;
		if($mod==0) {
			
			JOptionPane.showMessageDialog(null,$num1+" Is Multible of "+ $num2);
			
		}else {
			JOptionPane.showMessageDialog(null," They are not multiples ");
			
		}
		
		----------------------------------------------	
		*/
		
		
		/*
		----------------------------------------------	
	    Find the number equality or mayor 
	     	
		int $num1,$num2;
		
		Scanner $scan= new Scanner(System.in);
		
		System.out.println("Type number");
		$num1= $scan.nextInt();
		System.out.println("Type number");
		$num2=$scan.nextInt();
		
		if($num1==$num2) {
			System.out.println("Equality");
		}
		if($num1>$num2) {
		System.out.println("The number"+$num1+" is mayor to "+ $num2 );
		}
		if($num2>$num1) {
			System.out.println("The number "+$num2+" is mayor to "+ $num1 );	
			}
		----------------------------------------------		
		*/
		
		
		/*
		----------------------------------------------
		++Character.isUpperCase 
		
		char letra= JOptionPane.showInputDialog("Type Leter").charAt(0);
		
		if(Character.isUpperCase(letra)) {
			
			System.out.println("The letter is Upper");
		}else {
			
			JOptionPane.showMessageDialog(null, "No Upper Case");
		}
	
		----------------------------------------------
		*/
		
		/*
		----------------------------------------------
		++Descount of 20%
		
		
		JOptionPane.showMessageDialog(null,"Welcome to PlazaGrande!!");
		
		float $value;
		
		$value=Float.parseFloat(JOptionPane.showInputDialog("Value of your purchase"));
		
		if($value>300){
			
			JOptionPane.showMessageDialog(null,"you have descount of 20%");
			
			float $descount=(($value*20)/100);
			
			JOptionPane.showMessageDialog(null,"Your total to pay is of "+ $descount);
			
		*/
		

		 
/* 
 ---------------------------------------- 
		
		int $pay=0,$hours;
		int $extra,$finalPay,$payExtra;
		Scanner scan= new Scanner(System.in);
		
		//System.out.println("Type your hours of work");
		//$hours= scan.nextInt();
		$hours=Integer.parseInt(JOptionPane.showInputDialog("Type your Hours of Work"));
	 	

if($hours<=40) {
	$pay=$hours*16;	
	System.out.println("your pay for "+$hours+" Hours of work is of : "+$pay);
		
}else{
	int tope=40*16;
	$extra=$hours-40;	   //System.out.println($extra);
	$payExtra= $extra*20; //System.out.println($payExtra);
	$finalPay=$payExtra+tope;
	System.out.println("your pay for "+$hours+" Hours of work is of : "+ tope +" More pay of Hours Extra "+$extra+" In TOTAL; "+$finalPay);

		}

----------------------------------------- 
*/
		
/*
 ----------------------------------------- 
Number Pair or odd
		
		int $var,$num1;
		
		$var= Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
		
		$num1= $var % 2; 
		
		if($num1==0) {
			JOptionPane.showMessageDialog(null,"The number "+$var+" is pair");
			
		}else {
			JOptionPane.showMessageDialog(null,"The number "+$var+" No is pair");
		}
		-----------------------------------------		
*/
		
		/*
		-----------------------------------------	
		++Counting of letters .length(); // The type of value is String 
		
		String $num;
		
		$num=JOptionPane.showInputDialog("Type Number");
		
		 System.out.println("Counting of letters:"+$num.length());
		
		
		-----------------------------------------
		*/
		
/*--------------------------------------------------------------------		
		
//------------------------------------------	
		
		int $day=Integer.parseInt(JOptionPane.showInputDialog  ("Type Day"));
		int $month=Integer.parseInt(JOptionPane.showInputDialog("Type Month"));
		int $year=Integer.parseInt(JOptionPane.showInputDialog ("Type Year"));
		
//------------------------------------------		
		if(($day>=1) &&($day<=30)) {
		if(($month>0)&&($month<=12)) {
		if(($year>0)&&($year<=2100)) {
//------------------------------------------		
		
		switch($month){
		
		case 1: 
			System.out.println($day+" of " + "January"+" , "+ $year);
			break;
		case 2:
			System.out.println($day+" of " + "February"+" , "+ $year);
			break;
		case 3:
			System.out.println($day+" of " + "March"+ " , "+$year);
			break;
		case 4:
			System.out.println($day+" of " + "April"+" , "+ $year);
			break;
		case 5:
			System.out.println($day+" of " + "May"+" , "+ $year);
			break;
		case 6:
			System.out.println($day+" of " + "June"+" , "+ $year);
			break;
		case 7:
			System.out.println($day+" of " + "July"+" , "+ $year);
			break;
		case 8:
			System.out.println($day+" of " +"Agoust"+" , "+ $year);
			break;
		case 9:
			System.out.println($day+ " of "+"September"+" , "+ $year);
			break;
		case 10:
			JOptionPane.showMessageDialog(null, $day+" of "+" October "+ " , "+$year);
			//System.out.println($day+ " of "+"October"+" , "+ $year);
			break;
		case 11:
			System.out.println($day +" of "+ "November"+" , "+ $year);
			break;
		case 12:
			System.out.println($day+" of "+ "December"+" , "+ $year);
			break;
			}
		
		}

		}
		}

----------------------------------------
*/
		
/*
----------------------------------------	
	++Arrays Memory
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Type Numbers");
		
		int array[][] = new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
			
				array[i][j]= scan.nextInt();
				
				}	System.out.println(" ");
		}
	
		for( int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
		System.out.println(array[i][j]+" ");
			
					}	
				System.out.println("");
				}
			
----------------------------------------	
*/

/*----------------------------------------	
	
	++Practice Array :D
		
		
		String $array[]= new String[4];
		
		$array[0]="Jhon";
		$array[1]="Anderson";
		$array[2]="Vera";
		$array[3]="Barrero";
		
		int $date=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
		
		if(($date<4)&&($date>=0)) {
		JOptionPane.showMessageDialog(null,"Number " +$date+ " Equal "+$array[$date]);
	}
		
----------------------------------------
*/
		
/*
----------------------------------------
					
		char $array[][]= new char[2][2];
		
		$array[0][1]= 'J';
		$array[1][1]= 'H';
	   //int $date=Integer.parseInt(JOptionPane.showInputDialog("Type number");
		System.out.println($array[1][1]);
		
----------------------------------------		
		*/

/*----------------------------------------
		++ARRAY
		
		char $array1[] = new char[2];
		char $array2[] = new char[2];
		
		$array1[1]= 'a';
		$array2[0]= 'b' ;
		
		$array1[0]= 'c';
		$array2[1]= 'd';
		
		
		int $number=Integer.parseInt(JOptionPane.showInputDialog("type Number"));
		int $number1=Integer.parseInt(JOptionPane.showInputDialog("type Number"));
		
		System.out.println($array1[$number]+" && "+$array2[$number1]);
		
----------------------------------------
*/
		
/*--------------------------------------	
 ++ 	Calculator	
 
		int $sum,$rest,$product,$div,$mod,$num1,$num2;
	
		char value= JOptionPane.showInputDialog("Type Letter").charAt(0);
			$num1=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
				$num2=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
	//----------------------------------------	
		if((value == 'R')||(value == 'r') ) {
			$rest=$num1-$num2; 
			System.out.println(" REST "+$rest);
			}
	//----------------------------------------		
		if((value == 'S')||(value == 's') ) {
			$sum=$num1+$num2; 
			System.out.println(" SUM "+$sum);
			}
	//----------------------------------------	
		if((value == 'P')||(value == 'p') ) {
			$product=$num1*$num2; 
			System.out.println("PRODUCT "+$product);
			}
	//----------------------------------------	
		
		if((value == 'M')||(value == 'm') ) {
			$mod=$num1%$num2;
			System.out.println("MODULO "+$mod);
			}
	//----------------------------------------	
		if((value == 'D')||(value == 'd') ) {
			$div=$num1/$num2; 
			System.out.println("DIVISION "+ $div);
			}
--------------------------------------	
*/

/* 
--------------------------------------
	++NOTE
		float $note;	
		
	$note=Integer.parseInt(JOptionPane.showInputDialog("Type Note of Student "));
	
	if(($note>=0)&&($note<=10)){
	
	if(($note>=0)&&($note<=4) ) {
		System.out.println($note+" Note Insufficient ");
	}
	
	if(($note>4)&&($note<=9) ) {
		System.out.println($note+" Note acceptable ");
	}
	
	if($note==10) {
		System.out.println($note+" Note supreme ");
	}
	
	}else {
		
		System.out.println($note+" Note out of range ");
	
	}
	
--------------------------------------	
*/
		
/*------------------------------------



int $deposit,$remove;		
int $select=Integer.parseInt(JOptionPane.showInputDialog(null, "Options: "+ '\n' + "1) Deposit Money"+'\n'+"2) Remove Money"+'\n'+"3) GET OUT"));

switch($select){
case 1:
	$deposit=Integer.parseInt(JOptionPane.showInputDialog("You Have 1000 USD"+'\n'+"How much money will you deposit?"));
	int $depositOP=$deposit+1000;
	JOptionPane.showMessageDialog(null,"You Balance is of : "+$depositOP);
	break;
//------------------------------------------------------------------------------------	
case 2:
	$remove=Integer.parseInt(JOptionPane.showInputDialog("You Have 1000 USD"+'\n'+"How much money will you remove?"));
	if($remove<=1000) {
	int $removeOP=1000-$remove;
	JOptionPane.showMessageDialog(null,"You Balance is of : "+$removeOP);
	}else {
		int $negative=1000-$remove;
		JOptionPane.showMessageDialog(null, "BALANCE INSUFFICIENT FOR "+$negative+" USD!!");
	break;
	}	
//------------------------------------------------------------------------------------		
	case 3:
	JOptionPane.showMessageDialog(null,"EXIT");
	break;

	default:
	JOptionPane.showMessageDialog(null,"ERROR IN TYPE");
	break;	
}
----------------------------------------
*/
		
/*		
--------------------------------------	
	++COUNT
	int $nums;
	
	for ( $nums=1;$nums<=10;$nums++) {
		System.out.println("You Number is: "+$nums);
		
	}
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
--------------------------------------	
*/		
		
/*		
--------------------------------------			
	++ POSITIVE OR NEGATIVE
		int $num;
		
		$num=Integer.parseInt(JOptionPane.showInputDialog("Type number"));
		
		while($num!=0) {
			$num=Integer.parseInt(JOptionPane.showInputDialog("Type number"));
			
			if($num>=0) {
				JOptionPane.showMessageDialog(null,"POSITIVE"+$num);
			}else{
				JOptionPane.showMessageDialog(null,"NEGATIVE"+$num);
			}
		}
--------------------------------------
*/
		
/*	
--------------------------------------
		++Interesting
 		int numero,contador=0;
        
	      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
	        
	      while(numero >=0){
	          if(numero>=0){
	              System.out.println("Se ha introducido el numero "+numero);
	          contador++;
	         }
	          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
	       }
	        JOptionPane.showMessageDialog(null,"Se han introducido "+contador+" numeros");
	        
--------------------------------------- 
*/ 

/*	
---------------------------------------- 
 		++Number Random (0-100) (Math.random()*100);
		
		int $a, $b, $c;		
		$b=(int) (Math.random()*100);
		System.out.println($b);
		$a=0;
		
		while($a != $b) {
		$a=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
		 
		if($a>$b) {
			System.out.println("It is Mayor");
			
		}if($a<$b) {
			System.out.println("It is less");
		}
		}if($a==$b) {
		
		System.out.println("Number Equals!!");
		}
		
---------------------------------------- 
*/	

/*	
---------------------------------------- 
	    ++SAVE Number of the Sum in the variable.
	     
		int $num, $sum=0;
		
		do {
		$num=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
		$sum+=$num;
			}while($num!=0);

		System.out.println("Sum: "+$sum);
---------------------------------------- 
*/

/*
 ---------------------------------------- 
 
		int $num=100;
		
		 while(($num>=0)&&($num<=100)) {
			 
			  $num -=7;
			 System.out.println("Down In: "+$num);
			 
		 }
---------------------------------------- 	
*/

/*
---------------------------------------- 

		int $cero=0;
		
		for(int $num=1;$num<=10;$num++) {
			
		int $sum=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));	
		$cero+=$sum;
		
		if($num==10) {
			JOptionPane.showMessageDialog(null,"Sum: "+ $cero);
		}
		
		}
---------------------------------------- 
*/

/*--------------------------------------
		
		int[] array=new int[3];
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		Scanner scan=new Scanner(System.in);
		
		int $a=scan.nextInt();
		
		if(($a<=3)&&($a>=0)) {
		System.out.println(array[$a]);
		}
-----------------------------------------
*/	
/*---------------------------------------
 		++ARRAY Count
 
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Type Quantity");
		int $num=scan.nextInt();
		
		char[] array= new char[$num];
		
		for(int i=0;i<$num;i++) {
		
		char $a=scan.next().charAt(0);
		
		array[i]= $a;
		System.out.println("Position "+(i+1)+" SAVE: "+$a);
		} 
-------------------------------------------			
*/
/*
------------------------------------------		
		++ Form easy of show the date of the array
		String $array[]={"Jhon","Anderson","Vera","Barrero"};
			
		for(String i:$array) {
			
			System.out.println(i);
		}
------------------------------------------				
*/		
/*------------------------------------------
 		++ Form easy of show the date of the array
		String $array[]={"Jhon","Anderson","Vera","Barrero"};
		
		for(int i=0;i<$array.length;i++) {
			
			System.out.println(i+": "+$array[i]);
			}
		
------------------------------------------				
*/	
/*
------------------------------------------	
 		++Show Array in order
		
		int[] array= new int[5];
		
		for(int i=0;i<5;i++){
			int $num=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
			array[i]=$num;
			}
		
			for(int h:array) {
			System.out.println(h);
			}
------------------------------------------			
*/	
		
/*
------------------------------------------

		++Show Information inverse of the Array 
		
		int $array[]= new int[6];
			for(int i=0;i<5;i++) {
				int $a=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
				$array[i]=$a;  
			}
			for( int i=5;i>=0;i--) {
			System.out.println($array[i]);
			}
------------------------------------------			
*/
/*----------------------------------------		
		float $sumPositive=0,$sumNegative=0,$sp=1,$sn=1,$sumCero=0,divPositive=0, divNegative=0;
		int $sc=0;
		Scanner scan=new Scanner(System.in);
		
		
		float[] $array= new float[6];
		
		for(int i=0;i<5;i++) {
			int $a=scan.nextInt();
			$array[i]=$a;
			
			if($a>0) {
			
				$sumPositive+=$a;
				$sp++;
			}divPositive=($sumPositive/$sp);
			
			if($a<0) {
			
				$sumNegative+=$a;
				$sn++;
			 
			}divNegative=($sumNegative/$sn);
			
			if($a==0) {
				$sc++;
				
						} 
			}
		
		System.out.println("Have: "+$sc+" Zero");
		System.out.println("Average Positive: "+divPositive);
		System.out.println("Average Negative: "+divNegative);
		System.out.println($sp);
---------------------------------------------	
*/	
 /*
	int[] array1=new int[10];
	int[] array2=new int[10];
	int[] arrayR=new int[20];
	
	for(int i=0;i<10;i++) {
		int $a=Integer.parseInt(JOptionPane.showInputDialog("Type Number Array 1"));
		array1[i]=$a;
			
	}
	for(int c=0;c<10;c++) {
		int $b=Integer.parseInt(JOptionPane.showInputDialog("Type Number Array 2"));
		array1[c]=$b;
		
	}
	int j=0;


		for(int i=0;i<20;i++) {
		
		System.out.println(arrayR[i]);
		
	}
	
	*/

		/*
	
		Scanner scan=new Scanner(System.in);
	
		boolean $creciente=false,$decreciente=false,$igual=false;
		int[] $array= new int[10];
		
		for(int i=0;i<10;i++) {
			int $a=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
		
			$array[i]=$a;
		}
		for(int i=0;i<9;i++) {
			
	if($array[i]<$array[i+1]) {
		$creciente=true;
			}
			
	if($array[i]>$array[i+1]) {
		$decreciente=true;
			}
	
	if($array[i]==$array[i]) {
		$igual=true;
			}
		}if($creciente==true&& $decreciente==false) {
			System.out.println("Creciente");
			
		}else if($decreciente==true && $creciente==false) {
			System.out.println("Decreciente");
		}
		else if($igual==true && $creciente==false && $decreciente==false ) {
			System.out.println("Igual");
		}
		
		else if($creciente==true && $decreciente==true ) {
			System.out.println("Chaos");
		}
	
	*/

		/*
		Scanner scan= new Scanner (System.in);
		
		int[] array=new int[11];
		int[] array1= new int[11];
		int[] array2= new int[11];
		
		
		for(int i=0;i<10;i++) {
		System.out.println("Type Number");
		int $a= scan.nextInt();
		array[i]=$a;
		
		if($a%2 == 0) {
			
		array1[i]=$a;
		
		}else if($a%2 != 0){
			array2[i]=$a;
		}
		
		}
	
	for(int i=0;i<10;i++) {
			
			System.out.println("Total Numbers"+array[i]);
	}
	for(int i=0;i<10;i++) {
			
			System.out.println("pares"+array1[i]);
	}
	for(int i=0;i<10;i++) {
		
		System.out.println("impares"+array2[i]);
}
		
	*/
	
/*
-------------------------------------------------------------------------------------
		 FUSE ARRAY
		
		int[] arrayz=new int[11];
		int[] arrayx=new int[11];
		int[] arrayzx=new int[21];
		
		
		for(int i=1;i<11;i++) {
		int $num=Integer.parseInt(JOptionPane.showInputDialog(i+"). Type First Serie of Numbers"));
		
		
		arrayz[i]=$num;
		
		}
		for(int c=1;c<11;c++) {
		int $num2=Integer.parseInt(JOptionPane.showInputDialog(c+"). Type Second Serie of Numbers"));
		 
		arrayx[c]=$num2;
		}
		int j=0;
		for(int i=1;i<11;i++) {
			
			arrayzx[j]=arrayx[i];
			j++;
			arrayzx[j]=arrayz[i];
			j++;
			}
		
		for(int i=1;i<20;i++) {
		System.out.println(arrayzx[i]);
-------------------------------------------------------------------------------------		 
*/
/*-----------------------------------------------------------------------------------		

		++show the number of the arrangement and its position
		++Beautiful
		
		int[] array= new int[11];
		boolean creciente=true;
		do {
			for(int i=1;i<11;i++) {
				int $date=Integer.parseInt(JOptionPane.showInputDialog(i+"). Type Number"));
				array[i]=$date;
			}
			for(int i=1;i<10;i++) {
				
			if(array[i]<array[i+1]) {
				creciente=true;
			
			}if(array[i]>array[i+1]) {
				creciente=false;
				break;
			}
			}if(creciente==false) {
				JOptionPane.showMessageDialog(null,"Error, Type Number");
			}
			if(creciente==true) {
				JOptionPane.showMessageDialog(null,"Correct!!");
			}
		}while(creciente==false);
		
		int $num=Integer.parseInt(JOptionPane.showInputDialog("Search Number"));
		
		for(int i=0;i<11;i++) {
		
		if($num==array[i]) {
			JOptionPane.showMessageDialog(null,"Number FOUND "+$num+" In the position "+ array[i]);
		}else {
			JOptionPane.showMessageDialog(null,"Number Not Found");
			break;
		}
		}
	
*/
	/*
		Scanner scan=new Scanner(System.in);
		
		int aux,pos,arreglo[],nElementos;
		
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("type Number of array"));
		
		arreglo = new int [nElementos];
		
		System.out.println("Type Array");
		
		for(int i=0;i<nElementos;i++) {
			
			 System.out.println((i+1)+"Type Number");
			 
			 arreglo[i]=scan.nextInt();
		}
	
		for(int i=0;i<nElementos;i++) {
			
			pos=i;
			aux=arreglo[i];
			
			while((pos>0)&&(arreglo[pos-1] > aux)) {
				arreglo[pos]=arreglo[pos-1];
				pos--;
			}
		
		}
		
		for(int i=0;i<nElementos;i++) {
			
				System.out.print(arreglo[i]);
			
		}
	
*/
/*
---------------------------------------------------
		++Number FOUND
		int dato;
		dato=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
		int array[]={1,2,3,6,5};
		
		boolean res=false;
		
		int i=0;
		
		while(i<5 && res==false) {
			if(array[i]==dato) {
				res=true;
			}
			
			i++;	
				
			}
			if(res==false) {
				System.out.println("Error");
				
			}
			if(res==true) {
				System.out.println("Number Found");
			}
-------------------------------------------		
*/		
/*		
		++size of the matrix and data entry 
		
		int nFilas,nColumnas;

		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Type ROW"));
		nColumnas=Integer.parseInt(JOptionPane.showInputDialog("Type COLUMN"));
		
		
		int[][] array= new int[nFilas][nColumnas];
		
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				int $num=Integer.parseInt(JOptionPane.showInputDialog("["+i+"]"+"["+j+"]"+" Type Numbers"));
				array[i][j]=$num;
			}
			
		}
				
		
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				
				System.out.print(array[i][j]);
			
			}	System.out.println("");
		}
*/	
	/*	
	*/
	/*++ diagonal elements in the matrix
	
	int[][] matriz= new int[7][7];
	
	for(int i=0;i<7;i++) {
	matriz[i][i]=1;
		
	}
    System.out.println("\nMatriz\n");
	   for(int i=0;i<7;i++) {
		   
		   for (int j=0;j<7;j++) {
			   System.out.print(matriz[i][j]);
		   }
		   System.out.println("");
    }
	
	
	*/
	
	
	}
	}
		
	
	
	
