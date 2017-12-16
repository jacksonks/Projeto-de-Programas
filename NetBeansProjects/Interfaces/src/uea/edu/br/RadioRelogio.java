public class RadioRelogio implements Relogio{
	private String horario;
	
	public RadioRelogio(){}
	
	public RadioRelogio(String horario){
		this.horario = horario;
	}

	@Override
	public void setHorario(String horario) {
		this.horario = horario;		
	}

	@Override
	public String getHorario() {
		return this.horario;
	}

}