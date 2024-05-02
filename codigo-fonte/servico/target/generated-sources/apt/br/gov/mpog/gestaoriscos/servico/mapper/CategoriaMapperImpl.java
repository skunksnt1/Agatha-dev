package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Categoria;

import br.gov.mpog.gestaoriscos.modelo.dto.CategoriaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class CategoriaMapperImpl implements CategoriaMapper {

    @Autowired

    private NaturezaMapper naturezaMapper;

    @Override

    public CategoriaDTO categoriaToCategoriaDTO(Categoria categoria) {

        if ( categoria == null ) {

            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setId( categoria.getId() );

        categoriaDTO.setExcluido( categoria.isExcluido() );

        categoriaDTO.setDescricao( categoria.getDescricao() );

        categoriaDTO.setSearch( categoria.getSearch() );

        categoriaDTO.setStatus( categoria.isStatus() );

        categoriaDTO.setNatureza( naturezaMapper.naturezaToNaturezaDTO( categoria.getNatureza() ) );

        return categoriaDTO;
    }

    @Override

    public List<CategoriaDTO> categoriasToCategoriaDTOs(List<Categoria> categorias) {

        if ( categorias == null ) {

            return null;
        }

        List<CategoriaDTO> list = new ArrayList<CategoriaDTO>();

        for ( Categoria categoria : categorias ) {

            list.add( categoriaToCategoriaDTO( categoria ) );
        }

        return list;
    }

    @Override

    public Categoria categoriaDTOToCategoria(CategoriaDTO categoriaDTO) {

        if ( categoriaDTO == null ) {

            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setExcluido( categoriaDTO.isExcluido() );

        categoria.setDescricao( categoriaDTO.getDescricao() );

        categoria.setStatus( categoriaDTO.isStatus() );

        categoria.setSearch( categoriaDTO.getSearch() );

        categoria.setId( categoriaDTO.getId() );

        categoria.setNatureza( naturezaMapper.naturezaDTOToNatureza( categoriaDTO.getNatureza() ) );

        return categoria;
    }

    @Override

    public List<Categoria> categoriaDTOsToCategorias(List<CategoriaDTO> categoriaDTOs) {

        if ( categoriaDTOs == null ) {

            return null;
        }

        List<Categoria> list = new ArrayList<Categoria>();

        for ( CategoriaDTO categoriaDTO : categoriaDTOs ) {

            list.add( categoriaDTOToCategoria( categoriaDTO ) );
        }

        return list;
    }
}

