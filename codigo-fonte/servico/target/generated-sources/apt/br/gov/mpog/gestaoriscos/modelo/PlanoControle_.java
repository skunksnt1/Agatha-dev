package br.gov.mpog.gestaoriscos.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PlanoControle.class)
public abstract class PlanoControle_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBaseEventoRisco_ {

	public static volatile SingularAttribute<PlanoControle, ObjetivoControle> objetivo;
	public static volatile SingularAttribute<PlanoControle, String> interveniente;
	public static volatile SingularAttribute<PlanoControle, TipoControle> tipoControle;
	public static volatile SingularAttribute<PlanoControle, String> implementacao;
	public static volatile SingularAttribute<PlanoControle, Calendar> dtConclusao;
	public static volatile SingularAttribute<PlanoControle, Long> id;
	public static volatile SingularAttribute<PlanoControle, String> areaResponsavel;
	public static volatile SingularAttribute<PlanoControle, Calendar> dtInicio;
	public static volatile SingularAttribute<PlanoControle, Controle> controle;
	public static volatile SingularAttribute<PlanoControle, String> responsavel;

}

