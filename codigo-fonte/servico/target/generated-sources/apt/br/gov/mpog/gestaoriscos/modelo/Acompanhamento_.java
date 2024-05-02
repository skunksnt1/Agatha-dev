package br.gov.mpog.gestaoriscos.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Acompanhamento.class)
public abstract class Acompanhamento_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<Acompanhamento, String> implementado;
	public static volatile SingularAttribute<Acompanhamento, Calendar> dtCadastro;
	public static volatile SingularAttribute<Acompanhamento, String> justificativa;
	public static volatile ListAttribute<Acompanhamento, ArquivoAnexo> anexos;
	public static volatile SingularAttribute<Acompanhamento, PlanoControle> planoControle;
	public static volatile SingularAttribute<Acompanhamento, Long> id;
	public static volatile SingularAttribute<Acompanhamento, String> status;

}

