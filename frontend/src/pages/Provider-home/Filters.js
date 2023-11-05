import React from 'react'

export const Filters = (isGradjevinaChecked, setIsGradjevinaChecked,) => {
    return (
        <div className='center'
            style={{
                background: 'white',
                maxWidth:'400px'
            }}>
            <form className="pa4 shadow-2">
                <fieldset id="favorite_movies" className="bn">
                    <legend className="fw7 mb2">Kategorije</legend>
                    <div className="flex items-center mb2 f7 f5-ns">
                        <input className="mr2" type="checkbox" id="spacejam" value="spacejam" 
                        />
                        <label htmlFor="spacejam" className="lh-copy">Gradjevina</label>
                    </div>
                    <div className="flex items-center mb2 f7 f5-ns">
                        <input className="mr2" type="checkbox" id="airbud" value="airbud" />
                        <label htmlFor="airbud" className="lh-copy">Dezinsekcija</label>
                    </div>
                    <div className="flex items-center mb2 f7 f5-ns">
                        <input className="mr2" type="checkbox" id="hocuspocus" value="hocuspocus" />
                        <label htmlFor="hocuspocus" className="lh-copy">Vodoinstalaterske usluge</label>
                    </div>
                    <div className="flex items-center mb2 f7 f5-ns">
                        <input className="mr2" type="checkbox" id="diehard" value="diehard" />
                        <label htmlFor="diehard" className="lh-copy">Elektricarske usluge</label>
                    </div>
                </fieldset>
            </form>
        </div>
    )
}
