package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orgao.class)
public abstract class Orgao_ extends br.gov.mpog.gestaoriscos.modelo.base.EntidadeBaseOrgao_ {

	public static volatile SingularAttribute<Orgao, Orgao> orgaoPai;
	public static volatile ListAttribute<Orgao, Orgao> orgaosFilhos;
	public static volatile SingularAttribute<Orgao, NaturezaJuridica> naturezaJuridica;
	public static volatile ListAttribute<Orgao, Usuario> usuarios;
	public static volatile SingularAttribute<Orgao, CategoriaUnidade> categoriaUnidade;

}

