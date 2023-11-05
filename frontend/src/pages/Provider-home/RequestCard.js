import React from "react"

export const RequestCard = ({title, company, setRoute, categories}) => {
    return (
        <div className="shadow-2 pa3 ma4 center round br2" style={{
            maxWidth: "300px",
            background: 'white'
            }
        }>
            <p className="f5 ma2 fw6">{title}</p>
            <p className="f6 ma2 fw6">{company}</p>
            <a className="f6 link dim br1 ph3 pv2 mb2 dib white bg-blue br2"
                onClick={() => {setRoute('request')}}>Procitaj vise</a>
        </div>
    );
}