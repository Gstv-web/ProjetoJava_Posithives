package gen.projetojava;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ProjetoPosithives {
	
	public static void main(String[] args) {
		
		
		Calendar cal = new GregorianCalendar();
		int selectedYear = cal.get(Calendar.YEAR);
		int selectMonth = cal.get(Calendar.MONTH);
		int cDay = cal.get(Calendar.DATE); 
		int cMonth = cal.get(Calendar.MONTH); 
		int cYear = cal.get(Calendar.YEAR); 
		
		GregorianCalendar gCal = new GregorianCalendar(selectedYear, selectMonth, 1);
		int days = gCal.getActualMaximum(Calendar.DATE); 
		int startInWeek = gCal.get(Calendar.DAY_OF_WEEK); 

		
		gCal = new GregorianCalendar(selectedYear, selectMonth, days);
		int totalWeeks = gCal.getActualMaximum(Calendar.WEEK_OF_MONTH); 
		Scanner input = new Scanner(System.in);
		
		// Abertura do console
		
		
		System.out.println("==============================================");
		System.out.println("|                                            |");
		System.out.println("|                 Posithives                 |");
		System.out.println("|                                            |");
		System.out.println("==============================================");
		System.out.println("");
		System.out.println("Seja bem vindo ao Posithives!");
				
		char opcao;
		int idade;
		boolean pausa = true;
				
		System.out.print("Voc� possui HIV? \n\n1) Sim\n2) N�o\n3) N�o sei\nDigite sua op��o: ");
		while(pausa) {		
			opcao = input.next().charAt(0);
			if(opcao == '1') {
				System.out.println("");
				System.out.print("Voc� j� est� em tratamento? \n1) Sim\n2) N�o\nDigite sua op��o: ");
				while(pausa) {
					opcao = input.next().charAt(0);
					if(opcao == '1') {
						System.out.println("");
						System.out.print("Voc� j� tomou seu rem�dio hoje?\n1) Sim\n2) N�o\nDigite sua op��o: ");
						opcao = input.next().charAt(0);
						if(opcao == '1') {
							System.out.println("");
							System.out.println("|--------------------------|");
							System.out.println("|--DI�RIO DE MEDICAMENTOS--|");
							System.out.println("|--------------------------|");
							System.out.println("");
							int count = 1; // Contador de dias
							String[] months = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
							System.err.println(months[selectMonth]+"-"+selectedYear);
							System.out.println();
							System.out.println("D   S   T   Q   Q   S   S  ");
							for(int i = 1; i <= totalWeeks; i++) {
								System.out.println(); // pr�xima linha
								for(int j = 1; j <= 7; j++ ) { // Mostra "__" enquanto o primeiro dia do m�s n�o inicia (comparar com calend�rio do sistema) 
									if(count < startInWeek || (count - startInWeek + 1) > 31) {
										System.out.print("__");
										System.out.print("  ");
									}
									else {
										if(cDay == count - startInWeek + 1 && cMonth == selectMonth && cYear == selectedYear) {
											System.out.print(getDay(count - startInWeek + 1) + "*");  // mostra a data de hoje indicado com *
											System.out.print(" ");
										}
										else {
											System.out.print(getDay(count - startInWeek + 1));  // mostra a data de hoje indicado com *
											System.out.print("  ");
											}
										}
									count++;
									}
								}
							pausa = false;
						}
						else if(opcao == '2') {
							System.out.println("");
							System.out.println("|--------------------------|");
							System.out.println("|--DI�RIO DE MEDICAMENTOS--|");
							System.out.println("|--------------------------|");
							System.out.println("");
							int count = 1; // Contador de dias
							String[] months = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
							System.err.println(months[selectMonth]+"-"+selectedYear);
							System.out.println();
							System.out.println("D   S   T   Q   Q   S   S  ");
							for(int i = 1; i <= totalWeeks; i++) {
								System.out.println(); // pr�xima linha
								for(int j = 1; j <= 7; j++ ) { // Mostra "__" enquanto o primeiro dia do m�s n�o inicia (comparar com calend�rio do sistema) 
									if(count < startInWeek || (count - startInWeek + 1) > 31) {
										System.out.print("__");
										System.out.print("  ");
									}
									else {
										if(cDay == count - startInWeek + 1 && cMonth == selectMonth && cYear == selectedYear) {
											System.out.print(getDay(count - startInWeek + 1));  // mostra a data de hoje indicado com *
											System.out.print(" ");
										}
										else {
											System.out.print(getDay(count - startInWeek + 1));  // mostra a data de hoje indicado com *
											System.out.print("  ");
											}
										}
									count++;
									}
								}
							pausa = false;
						}
						else {
							System.out.print("ERRO -- Digite apenas as op��es 1 ou 2:  ");
						}
					}
					else if(opcao == '2') {
						System.out.println("");
						System.out.print(" ____________________________________________________________________________\n");
						System.out.println("|                                                                            |");
						System.out.print("|**Procure um CTA para mais informa��es.**                                   |\n");
						System.out.print("|Digite seu CEP para localizar o CTA mais pr�ximo de sua resid�ncia:         |");
						System.out.print("\n|____________________________________________________________________________|\n");
						pausa = false;
						// input para cep (tentar API)
					}
					else {
						System.out.print("ERRO -- Digite apenas as op��es 1 ou 2:  ");
					}	
				}
			}
			else if(opcao == '2') {
				System.out.println("");
				System.out.print("Gostaria de participar do estudo sobre vacina contra o HIV?\n1) Sim\n2) N�o\nDigite sua op��o: ");
				while(pausa) {
					opcao = input.next().charAt(0);
					if(opcao == '1') {
						System.out.println("");
						System.out.print("Digite a sua idade: ");
						idade = input.nextInt();
						if(idade >= 18 && idade <= 60) {
							System.out.println("");
							System.out.print("Est� em boas condi��es de sa�de?\n1) Sim\n2) N�o\nDigite sua op��o: ");
							while(pausa) {
								opcao = input.next().charAt(0);
								if(opcao == '1') {
									System.out.println("");
									System.out.print("Voc� utiliza PrEP?\n1) Sim\n2) N�o\nDigite sua op��o: ");
									while(pausa) {
										opcao = input.next().charAt(0);
										if(opcao == '1') {
											System.out.println("");
											System.out.println("Voc� n�o possui os crit�rios eleg�veis. O programa ser� encerrado.");
											pausa = false;
										}
										else if(opcao == '2') {
											System.out.println(" __________________________________________________________________");
											System.out.println("|                                                                  |");
											System.out.println("| PreP - A Profilaxia Pr�-Exposi��o de risco � infec��o pelo HIV - |\n| "
																+ "consiste no uso preventivo de medicamentos antirretrovirais      |\n|"
																+ " antes da exposi��o sexual ao v�rus para reduzir a probabilidade  |\n"
																+ "| de infec��o pelo HIV. O objetivo da PreP � previnir a infec��o   |\n"
																+ "| pelo HIV e promover uma vida sexual mais saud�vel.               |");
											System.out.println("|                                                                  |");
											System.out.println("| Para mais informa��es acesse o site: www.aids.gov.br             |");
											System.out.println("|__________________________________________________________________|");
											pausa = false;
										}
										else {
											System.out.println("ERRO -- Digite apenas as op��es 1 ou 2:  ");
										}
									}
									
								}
								else if(opcao == '2') {
									System.out.println("Voc� n�o possui os crit�rios eleg�veis. O programa ser� encerrado.");
									pausa = false;
								}
								else {
									System.out.println("ERRO -- Digite apenas as op��es 1 ou 2:  ");
								}
							}
						}
						else {
							System.out.println("Voc� n�o possui os crit�rios eleg�veis. O programa ser� encerrado.");
							pausa = false;
						}
					}
					else if(opcao == '2') {
						System.out.println("");
						System.out.println("Continue se prevenindo!");
						pausa = false;
					}
					else {
						System.out.print("ERRO -- Digite apenas as op��es 1 ou 2:  ");
					}
				}
				
			}
			else if(opcao == '3') {
				System.out.println("");
				System.out.print(" ____________________________________________________________________________\n");
				System.out.println("|                                                                            |");
				System.out.print("|**Procure um CTA para mais informa��es.**                                   |\n");
				System.out.print("|Digite seu CEP para localizar o CTA mais pr�ximo de sua resid�ncia:         |");
				System.out.print("\n|____________________________________________________________________________|\n");
				pausa = false;
				//input para cep (tentar API)
			}
			else {
				System.out.print("ERRO -- Digite apenas as op��es de 1 a 3:  ");
			}
		}
				
		System.out.println("\n\n--FIM DO PROGRAMA--");
		input.close();

	}

	private static String getDay(int i) {
		
		String sDate = Integer.toString(i);
		if(sDate.length() == 1) {
			sDate = "0" + sDate;
			return sDate;
		}
		return sDate;
	}
	
}


