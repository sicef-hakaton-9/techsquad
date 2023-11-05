import React from 'react';
import './Request.css'

export function Request({route, setRoute}) {
  return (
      <div style={{
          color: 'black', background: 'white',
          marginLeft: 'auto',
          marginRight: 'auto',
          maxWidth: '500px',
          marginTop: '100px',
          position: 'relative'
            }}
          className='center pa3 shadow-2'>
          <div id="exitModule" className='absolute' onClick={() => setRoute('home')}>X</div>
          <p className='f2 fw7 mt3 center' style={{textAlign: 'center'}}>Renoviranje PMF-a u Nisu</p>
          <p className='f6'><span className='fw6'>Ime oglasavaca: </span>Univerzitet u Nisu</p>
          <p className='f6'><span className='fw6'>PIB oglasavaca: </span> 100668023</p>
          <p className='f6'><span className='fw6'>Email oglasavaca: </span>pmfinfo@pmf.ni.ac.rs</p>
          <p className='f6'><span className='fw6'>Broj oglasavaca: </span>(018) 533-015</p>
          <p className='f3 ma1 fw6 center text-center' style={{ textAlign: 'center' }}>Opis oglasa</p>
          <p className='f6'>Poštovane građevinske firme,

              Prirodno-matematicki fakultet u Nisu se obraća vama s potrebom za renoviranjem našeg fakultetskog prostora. Kao ugledna institucija obrazovanja, želimo stvoriti inspirirajuće i funkcionalne učioničke i administrativne prostorije za naše studente, nastavnike i osoblje.

              Renoviranje obuhvata više različitih projektnih aspekata, uključujući obnovu podova, osvježenje zidova i stropova, modernizaciju elektroinstalacija, instalaciju energetski učinkovitih prozora i vrata, te opremanje prostora odgovarajućim namještajem i opremom.</p>

          <p className='f3 ma4 fw6 center' style={{textAlign: 'center'}}>Kategorije oglasa</p>
          <p className='flex flex-wrap i' style={{ justifyContent: 'space-evenly' }}><span className='f4 fw5'>Vodoinstalaterske usluge</span> <span className='f4 fw5'>Gradjevina</span></p>
          <div className='flex justify-center'>
              <a className="f4 center link dim br1 ph3 pv2 mb2 mt2 dib white bg-blue br2" style={{ textAlign: 'center' }}>Prijavi se</a>
          </div>
          
      </div>

      
  )
}
