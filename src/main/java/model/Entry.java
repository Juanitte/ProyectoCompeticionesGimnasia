package model;

public class Entry<T>{

	private T participante;
	private int number;
	private String time;
	private double points;
	
	public Entry() {
		this.participante = null;
		this.number = -1;
		this.time = "";
		this.points = 0;
	}
	
	public Entry(T participante, int number, String time, double points) {
		this.participante = participante;
		this.number = number;
		this.time = time;
		this.points = points;
	}

	public T getParticipante() {
		return participante;
	}

	public void setParticipante(T participante) {
		this.participante = participante;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((participante == null) ? 0 : participante.hashCode());
		long temp;
		temp = Double.doubleToLongBits(points);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Entry<T> other = (Entry<T>) obj;
		if (number != other.number)
			return false;
		if (participante == null) {
			if (other.participante != null)
				return false;
		} else if (!participante.equals(other.participante))
			return false;
		if (Double.doubleToLongBits(points) != Double.doubleToLongBits(other.points))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Participación: \n\tParticipante: " + participante.toString() + "\n\tDorsal: " + number + "\n\tHora: " + time + "\n\tPuntos:" + points;
	}

}
