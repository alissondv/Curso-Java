# Principais tipos Java (versão 8+)
* Data-hora local
    * LocalDate
    * LocalDateTime


* Data-hora global
    * Instant


* Duração
    * Duration


* Outros
    * ZoneId
    * ChronoUnit


~~~Javascript
DateTimeFormatter fmt1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
		
		System.out.println(d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);
		
		System.out.println(d09);
~~~