package br.gov.mpog.gestaoriscos.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistoricoEventoRisco.class)
public abstract class HistoricoEventoRisco_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<HistoricoEventoRisco, String> evento;
	public static volatile SingularAttribute<HistoricoEventoRisco, EventoRisco> eventoRisco;
	public static volatile SingularAttribute<HistoricoEventoRisco, Calendar> dtCadastro;
	public static volatile SingularAttribute<HistoricoEventoRisco, Usuario> usuario;
	public static volatile SingularAttribute<HistoricoEventoRisco, Long> id;

}

