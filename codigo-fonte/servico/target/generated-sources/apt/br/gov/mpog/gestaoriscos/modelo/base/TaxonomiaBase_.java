package br.gov.mpog.gestaoriscos.modelo.base;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TaxonomiaBase.class)
public abstract class TaxonomiaBase_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<TaxonomiaBase, String> search;
	public static volatile SingularAttribute<TaxonomiaBase, Calendar> dtCadastro;
	public static volatile SingularAttribute<TaxonomiaBase, String> justificativa;
	public static volatile SingularAttribute<TaxonomiaBase, Long> id;
	public static volatile SingularAttribute<TaxonomiaBase, String> descricao;

}

