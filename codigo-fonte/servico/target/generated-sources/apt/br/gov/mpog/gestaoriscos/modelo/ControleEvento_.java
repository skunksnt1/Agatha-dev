package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ControleEvento.class)
public abstract class ControleEvento_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBaseEventoRisco_ {

	public static volatile SingularAttribute<ControleEvento, Operacao> operacao;
	public static volatile SingularAttribute<ControleEvento, Long> id;
	public static volatile SingularAttribute<ControleEvento, Controle> controle;
	public static volatile SingularAttribute<ControleEvento, Desenho> desenho;

}

