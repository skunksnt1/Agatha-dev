package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ProcessoAnexo;

import br.gov.mpog.gestaoriscos.modelo.dto.ProcessoAnexoDTO;

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

public class ProcessoAnexoMapperImpl implements ProcessoAnexoMapper {

    @Autowired

    private ArquivoAnexoMapper arquivoAnexoMapper;

    @Override

    public ProcessoAnexoDTO processoAnexoToProcessoAnexoDTO(ProcessoAnexo processoAnexo) {

        if ( processoAnexo == null ) {

            return null;
        }

        ProcessoAnexoDTO processoAnexoDTO = new ProcessoAnexoDTO();

        processoAnexoDTO.setId( processoAnexo.getId() );

        processoAnexoDTO.setExcluido( processoAnexo.isExcluido() );

        processoAnexoDTO.setArquivoAnexo( arquivoAnexoMapper.arquivoAnexoToArquivoAnexoDTO( processoAnexo.getArquivoAnexo() ) );

        return processoAnexoDTO;
    }

    @Override

    public List<ProcessoAnexoDTO> processoAnexosToProcessoAnexoDTOs(List<ProcessoAnexo> processoAnexos) {

        if ( processoAnexos == null ) {

            return null;
        }

        List<ProcessoAnexoDTO> list = new ArrayList<ProcessoAnexoDTO>();

        for ( ProcessoAnexo processoAnexo : processoAnexos ) {

            list.add( processoAnexoToProcessoAnexoDTO( processoAnexo ) );
        }

        return list;
    }

    @Override

    public ProcessoAnexo processoAnexoDTOToProcessoAnexo(ProcessoAnexoDTO processoAnexoDTO) {

        if ( processoAnexoDTO == null ) {

            return null;
        }

        ProcessoAnexo processoAnexo = new ProcessoAnexo();

        processoAnexo.setExcluido( processoAnexoDTO.isExcluido() );

        processoAnexo.setId( processoAnexoDTO.getId() );

        processoAnexo.setArquivoAnexo( arquivoAnexoMapper.arquivoAnexoDTOToArquivoAnexo( processoAnexoDTO.getArquivoAnexo() ) );

        return processoAnexo;
    }

    @Override

    public List<ProcessoAnexo> processoAnexoDTOsToProcessoAnexos(List<ProcessoAnexoDTO> processoAnexoDTOs) {

        if ( processoAnexoDTOs == null ) {

            return null;
        }

        List<ProcessoAnexo> list = new ArrayList<ProcessoAnexo>();

        for ( ProcessoAnexoDTO processoAnexoDTO : processoAnexoDTOs ) {

            list.add( processoAnexoDTOToProcessoAnexo( processoAnexoDTO ) );
        }

        return list;
    }
}

