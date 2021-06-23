import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author rsmal
 */
public class Data {

    Calendar calendar;
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        calendar = new GregorianCalendar(ano, mes-1, dia);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static Data parse(String data) {

        String[] dataComponentes = data.trim().split("/");
        int dia = Integer.valueOf(dataComponentes[0]);
        int mes = Integer.valueOf(dataComponentes[1]);
        int ano = Integer.valueOf(dataComponentes[2]);

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1976) {
            throw new IllegalArgumentException();
        }

        return new Data(dia, mes, ano);
    }

    public static boolean datasIguais(Data dataNascimento, Data dataNascimento1) {
        return dataNascimento.equals(dataNascimento1);
    }

    public static int compararDatas(Data data1, Data data2) {
        if (data1.getAno() > data2.getAno()) {
            return -1;
        }

        if (data1.getAno() == data2.getAno() && data1.getMes() > data2.getMes()) {
            return -1;
        }

        if (data1.getAno() == data2.getAno() && data1.getMes() == data2.getMes() && data1.getDia() > data2.getDia()) {
            return -1;
        }

        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(calendar, data.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendar);
    }

    @Override
    public String toString() {
        return calendar.get(Calendar.DAY_OF_MONTH) + "/" +
                (calendar.get(Calendar.MONTH)+1) + "/" +
                calendar.get(Calendar.YEAR);
    }

    public int getDia () {
        return this.dia;
    }

    public int getMes () {
        return this.mes;
    }

    public int getAno () {
        return this.ano;
    }



}
