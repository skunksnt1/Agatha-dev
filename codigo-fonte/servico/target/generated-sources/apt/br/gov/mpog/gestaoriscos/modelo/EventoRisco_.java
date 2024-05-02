package br.gov.mpog.gestaoriscos.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EventoRisco.class)
public abstract class EventoRisco_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<EventoRisco, Identificacao> identificacao;
	public static volatile SingularAttribute<EventoRisco, Categoria> categoria;
	public static volatile ListAttribute<EventoRisco, HistoricoEventoRisco> historico;
	public static volatile SingularAttribute<EventoRisco, RespostaRisco> respostaRisco;
	public static volatile SingularAttribute<EventoRisco, CalculoRisco> calculoRiscoInerente;
	public static volatile SingularAttribute<EventoRisco, Calendar> dtAtualizacao;
	public static volatile SingularAttribute<EventoRisco, String> justificativaRespostaRisco;
	public static volatile ListAttribute<EventoRisco, EventoConsequencia> consequencias;
	public static volatile SingularAttribute<EventoRisco, Evento> evento;
	public static volatile ListAttribute<EventoRisco, EventoCausa> causas;
	public static volatile ListAttribute<EventoRisco, PlanoControle> planos;
	public static volatile ListAttribute<EventoRisco, ControleEvento> controleEventos;
	public static volatile SingularAttribute<EventoRisco, Boolean> riscoIntegridade;
	public static volatile ListAttribute<EventoRisco, PlanoControle> controles;
	public static volatile SingularAttribute<EventoRisco, Long> id;
	public static volatile SingularAttribute<EventoRisco, CalculoRisco> calculoRiscoResidual;

}

