package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AgrupamentoTaxonomia.class)
public abstract class AgrupamentoTaxonomia_ {

	public static volatile SingularAttribute<AgrupamentoTaxonomia, Boolean> excluido;
	public static volatile ListAttribute<AgrupamentoTaxonomia, Taxonomia> taxonomias;
	public static volatile SingularAttribute<AgrupamentoTaxonomia, Long> id;
	public static volatile SingularAttribute<AgrupamentoTaxonomia, Taxonomia> taxonomia;

}

