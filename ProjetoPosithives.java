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
				
		String opcao;
		int idade;
		boolean pausa = true;
				
		System.out.print("Você possui HIV? \n\n1) Sim\n2) Não\n3) Não sei\nDigite sua opção: ");
		while(pausa) {		
			opcao = input.next();
			if("1".equals(opcao)) {
				System.out.println("");
				System.out.print("Você já está em tratamento? \n1) Sim\n2) Não\nDigite sua opção: ");
				while(pausa) {
					opcao = input.next();
					if("1".equals(opcao)) {
						System.out.println("");
						System.out.print("Você já tomou seu remédio hoje?\n1) Sim\n2) Não\nDigite sua opção: ");
						opcao = input.next();
						if("1".equals(opcao)) {
							System.out.println("");
							System.out.println("|--------------------------|");
							System.out.println("|--DIÁRIO DE MEDICAMENTOS--|");
							System.out.println("|--------------------------|");
							System.out.println("");
							int count = 1; // Contador
							String[] months = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
							System.out.println(months[selectMonth]+"-"+selectedYear);
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
											System.out.print(getDay(count - startInWeek + 1));  // mostra a data de hoje
											System.out.print("  ");
											}
										}
									count++;
									}
								}
							pausa = false;
						}
						else if("2".equals(opcao)) {
							System.out.println("");
							System.out.println("|--------------------------|");
							System.out.println("|--DIÁRIO DE MEDICAMENTOS--|");
							System.out.println("|--------------------------|");
							System.out.println("");
							int count = 1; // Contador de dias
							String[] months = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
							System.out.println(months[selectMonth]+"-"+selectedYear);
							System.out.println();
							System.out.println("S   T   Q   Q   S   S   D  ");
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
											System.out.print("  ");
										}
										else {
											System.out.print(getDay(count - startInWeek + 1));  // mostra a data de hoje
											System.out.print("  ");
											}
										}
									count++;
									}
								}
							pausa = false;
						}
						else {
							System.out.print("ERRO -- Digite apenas as opções 1 ou 2:  ");
						}
					}
					else if("2".equals(opcao)) {
						System.out.println("");
						System.out.print(" ____________________________________________________________________________\n");
						System.out.println("|                                                                            |");
						System.out.print("|**Procure um CTA para mais informações.**                                   |\n");
						System.out.print("|Digite seu CEP para localizar o CTA mais próximo de sua residência:         |");
						System.out.print("\n|____________________________________________________________________________|\n");
						pausa = false;
						// input para cep (tentar API)
					}
					else {
						System.out.print("ERRO -- Digite apenas as opções 1 ou 2:  ");
					}	
				}
			}
			else if("2".equals(opcao)) {
				System.out.println("");
				System.out.print("Gostaria de participar do estudo sobre vacina contra o HIV?\n1) Sim\n2) Não\nDigite sua opção: ");
				while(pausa) {
					opcao = input.next();
					if("1".equals(opcao)) {
						System.out.println("");
						System.out.print("Digite a sua idade: ");
						idade = input.nextInt();
						if(idade >= 18 && idade <= 60) {
							System.out.println("");
							System.out.print("Está em boas condições de saúde?\n1) Sim\n2) Não\nDigite sua opição: ");
							while(pausa) {
								opcao = input.next();
								if("1".equals(opcao)) {
									System.out.println("");
									System.out.print("Você utiliza PrEP?\n1) Sim\n2) Não\nDigite sua opção: ");
									while(pausa) {
										opcao = input.next();
										if("1".equals(opcao)) {
											System.out.println("");
											System.out.println("Você não possui os critérios elegíveis. O programa será encerrado.");
											pausa = false;
										}
										else if("2".equals(opcao)) {
											System.out.println(" __________________________________________________________________");
											System.out.println("|                                                                  |");
											System.out.println("| PreP - A Profilaxia Pré-Exposição de risco à infecção pelo HIV - |\n| "
																+ "consiste no uso preventivo de medicamentos antirretrovirais      |\n|"
																+ " antes da exposição sexual ao vírus para reduzir a probabilidade  |\n"
																+ "| de infecção pelo HIV. O objetivo da PreP é previnir a infecção   |\n"
																+ "| pelo HIV e promover uma vida sexual mais saudável.               |");
											System.out.println("|                                                                  |");
											System.out.println("| Para mais informações acesse o site: www.aids.gov.br             |");
											System.out.println("|__________________________________________________________________|");
											pausa = false;
										}
										else {
											System.out.println("ERRO -- Digite apenas as opções 1 ou 2:  ");
										}
									}
									
								}
								else if("2".equals(opcao)) {
									System.out.println("Você não possui os critérios elegíveis. O programa será encerrado.");
									pausa = false;
								}
								else {
									System.out.println("ERRO -- Digite apenas as opções 1 ou 2:  ");
								}
							}
						}
						else {
							System.out.println("Você não possui os critérios elegíveis. O programa será encerrado.");
							pausa = false;
						}
					}
					else if("2".equals(opcao)) {
						System.out.println("");
						System.out.println("Continue se prevenindo!");
						pausa = false;
					}
					else {
						System.out.print("ERRO -- Digite apenas as opções 1 ou 2:  ");
					}
				}
				
			}
			else if("3".equals(opcao)) {
				System.out.println("");
				System.out.print(" ____________________________________________________________________________\n");
				System.out.println("|                                                                            |");
				System.out.print("|**Procure um CTA para mais informações.**                                   |\n");
				System.out.print("|Digite seu CEP para localizar o CTA mais próximo de sua residência:         |");
				System.out.print("\n|____________________________________________________________________________|\n");
				pausa = false;
				//input para cep (tentar API)
			}
			else {
				System.out.print("ERRO -- Digite apenas as opções de 1 a 3:  ");
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

