package tela.servidor.formatter;

import com.towel.bean.Formatter;
import comum.tipos.Localizacao;

public class LocalizacaoFormatter implements Formatter {
	public Object format(Object obj) {
		Localizacao d = (Localizacao) obj;
		return d.toString();
	}

	public Object parse(Object obj) {
		return Localizacao.valueOf((String) obj);
	}

	public String getName() {
		return "tipo";
	}
}