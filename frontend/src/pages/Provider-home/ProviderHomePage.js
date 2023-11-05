import React from "react"
import { RequestCard } from "./RequestCard";
import { AdComponent } from "./AdComponent";
import { Filters } from "./Filters";
import './ProviderHomePage.css'
export const ProviderHomePage = ({route, setRoute}) => {
    return (
        <div style={{ textAlign: 'center' }}
            className="pt5 ">
            <div style={{
                width: "70%"
            }} className="ProviderHomePage">
                <h1 className="f2">Trenutni oglasi</h1>
                <Filters />
                <RequestCard title={"Izgradnja nove zeleznice u Nisu"} company={"Zeleznica Srbije AD"} setRoute={setRoute}/>
                <RequestCard title={"Prskanje protiv bubasvaba"} company={"Gradska bolnica Nis"} setRoute={setRoute} />
                <RequestCard title={"Renoviranje PMF-a u Nisu"} company={"Univerzitet u Nisu"} setRoute={setRoute} />
            </div>
            <AdComponent />
            <AdComponent left={true} />
        </div>
        
    );
}