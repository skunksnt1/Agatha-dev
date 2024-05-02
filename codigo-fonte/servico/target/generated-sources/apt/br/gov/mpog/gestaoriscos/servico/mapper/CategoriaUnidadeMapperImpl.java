package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.CategoriaUnidade;

import br.gov.mpog.gestaoriscos.modelo.dto.CategoriaUnidadeDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class CategoriaUnidadeMapperImpl implements CategoriaUnidadeMapper {

    @Override

    public CategoriaUnidadeDTO categoriaUnidadeToCategoriaUnidadeDTO(CategoriaUnidade categoriaUnidade) {

        if ( categoriaUnidade == null ) {

            return null;
        }

        CategoriaUnidadeDTO categoriaUnidadeDTO = new CategoriaUnidadeDTO();

        categoriaUnidadeDTO.setId( categoriaUnidade.getId() );

        categoriaUnidadeDTO.setNome( categoriaUnidade.getNome() );

        categoriaUnidadeDTO.setSigla( categoriaUnidade.getSigla() );

        return categoriaUnidadeDTO;
    }

    @Override

    public List<CategoriaUnidadeDTO> categoriaUnidadesToCategoriaUnidadeDTOs(List<CategoriaUnidade> categoriaUnidades) {

        if ( categoriaUnidades == null ) {

            return null;
        }

        List<CategoriaUnidadeDTO> list = new ArrayList<CategoriaUnidadeDTO>();

        for ( CategoriaUnidade categoriaUnidade : categoriaUnidades ) {

            list.add( categoriaUnidadeToCategoriaUnidadeDTO( categoriaUnidade ) );
        }

        return list;
    }

    @Override

    public CategoriaUnidade categoriaUnidadeDTOToCategoriaUnidade(CategoriaUnidadeDTO categoriaUnidadeDTO) {

        if ( categoriaUnidadeDTO == null ) {

            return null;
        }

        CategoriaUnidade categoriaUnidade = new CategoriaUnidade();

        categoriaUnidade.setId( categoriaUnidadeDTO.getId() );

        categoriaUnidade.setNome( categoriaUnidadeDTO.getNome() );

        categoriaUnidade.setSigla( categoriaUnidadeDTO.getSigla() );

        return categoriaUnidade;
    }

    @Override

    public List<CategoriaUnidade> categoriaUnidadeDTOsToCategoriaUnidades(List<CategoriaUnidadeDTO> categoriaUnidadeDTOs) {

        if ( categoriaUnidadeDTOs == null ) {

            return null;
        }

        List<CategoriaUnidade> list = new ArrayList<CategoriaUnidade>();

        for ( CategoriaUnidadeDTO categoriaUnidadeDTO : categoriaUnidadeDTOs ) {

            list.add( categoriaUnidadeDTOToCategoriaUnidade( categoriaUnidadeDTO ) );
        }

        return list;
    }
}

