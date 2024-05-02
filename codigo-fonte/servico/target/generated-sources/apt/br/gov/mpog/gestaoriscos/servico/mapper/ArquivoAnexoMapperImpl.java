package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ArquivoAnexo;

import br.gov.mpog.gestaoriscos.modelo.dto.ArquivoAnexoDTO;

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

public class ArquivoAnexoMapperImpl implements ArquivoAnexoMapper {

    @Override

    public ArquivoAnexoDTO arquivoAnexoToArquivoAnexoDTO(ArquivoAnexo arquivoAnexo) {

        if ( arquivoAnexo == null ) {

            return null;
        }

        ArquivoAnexoDTO arquivoAnexoDTO = new ArquivoAnexoDTO();

        arquivoAnexoDTO.setExcluido( arquivoAnexo.isExcluido() );

        arquivoAnexoDTO.setId( arquivoAnexo.getId() );

        arquivoAnexoDTO.setNomeArquivo( arquivoAnexo.getNomeArquivo() );

        arquivoAnexoDTO.setNomeDocumento( arquivoAnexo.getNomeDocumento() );

        arquivoAnexoDTO.setTamanho( arquivoAnexo.getTamanho() );

        arquivoAnexoDTO.setDataUpload( arquivoAnexo.getDataUpload() );

        return arquivoAnexoDTO;
    }

    @Override

    public List<ArquivoAnexoDTO> arquivoAnexosToArquivoAnexoDTOs(List<ArquivoAnexo> arquivoAnexos) {

        if ( arquivoAnexos == null ) {

            return null;
        }

        List<ArquivoAnexoDTO> list = new ArrayList<ArquivoAnexoDTO>();

        for ( ArquivoAnexo arquivoAnexo : arquivoAnexos ) {

            list.add( arquivoAnexoToArquivoAnexoDTO( arquivoAnexo ) );
        }

        return list;
    }

    @Override

    public ArquivoAnexo arquivoAnexoDTOToArquivoAnexo(ArquivoAnexoDTO arquivoAnexoDTO) {

        if ( arquivoAnexoDTO == null ) {

            return null;
        }

        ArquivoAnexo arquivoAnexo = new ArquivoAnexo();

        arquivoAnexo.setExcluido( arquivoAnexoDTO.isExcluido() );

        arquivoAnexo.setId( arquivoAnexoDTO.getId() );

        arquivoAnexo.setNomeArquivo( arquivoAnexoDTO.getNomeArquivo() );

        arquivoAnexo.setNomeDocumento( arquivoAnexoDTO.getNomeDocumento() );

        arquivoAnexo.setTamanho( arquivoAnexoDTO.getTamanho() );

        arquivoAnexo.setDataUpload( arquivoAnexoDTO.getDataUpload() );

        return arquivoAnexo;
    }

    @Override

    public List<ArquivoAnexo> arquivoAnexoDTOsToArquivoAnexos(List<ArquivoAnexoDTO> arquivoAnexoDTOs) {

        if ( arquivoAnexoDTOs == null ) {

            return null;
        }

        List<ArquivoAnexo> list = new ArrayList<ArquivoAnexo>();

        for ( ArquivoAnexoDTO arquivoAnexoDTO : arquivoAnexoDTOs ) {

            list.add( arquivoAnexoDTOToArquivoAnexo( arquivoAnexoDTO ) );
        }

        return list;
    }
}

