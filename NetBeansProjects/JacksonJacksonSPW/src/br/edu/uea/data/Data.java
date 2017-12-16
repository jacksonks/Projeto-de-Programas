package br.edu.uea.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

	private int dia;
	private int mes;
	private int ano;


	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	// constrói o objeto Data com os valores recebidos via parâmetros
	public Data(int dia, int mes, int ano){
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	public String toString(int year,int month,int day){
		Date date = new GregorianCalendar(year, month, day).getTime();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String a = f.format(date);
		return a;
	}
	public boolean antes(int year, int month, int day){
		Date data3 = new GregorianCalendar(year, month, day).getTime();

		Date data4 = new Date();
		if(data3.after(data4))
			return true;
		else
			return false;
	}
	public boolean depois(int year, int month, int day){
		Date data3 = new GregorianCalendar(year, month, day).getTime();

		Date data4 = new Date();
		if(data3.before(data4))
			return true;
		else
			return false;
	}
	public boolean igual(int year, int month, int day){
		Date data3 = new GregorianCalendar(year, month, day).getTime();

		Date data4 = new Date();
		if(data3.equals(data4))
			return true;
		else
			return false;
	}
	public String ehValido(int year,int month,int day){
		
		Date data3 = new GregorianCalendar(year, month, day).getTime();

		Date data4 = new Date();
		if(data3.after(data4)){
			return "Sim";
		}else if(data3.before(data4)){
			return "Não";
		}else{
			System.out.println("Data: " + data3 + " é igual à " + data4);
		}
			return "Sim";
		
	}

	public void setDia(int d){
		this.dia = d;
	}

	public void setMes(int m){
		this.mes = m;
	}

	public void setAno(int a){
		this.ano = a;
	}
}
