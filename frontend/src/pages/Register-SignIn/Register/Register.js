import { useState } from "react";
import React from "react";

const styles = {
    form: {
        width: "70%",
        maxWidth: "400px",
        marginTop: '100px',
        textAlign: 'center',
        background: 'white'
    }

}

export const Register = ({route, setRoute}) => {

    const [selectedOptionCompanyType, setSelectedOptionCompanyType] = useState("government");
    const [selectedOptionTypeOfService, setSelectedOptionTypeOfService] = useState("offer");
    const [registerPIB, setRegisterPIB] = useState("");
    const [registerPhoneNumber, setRegisterPhoneNumber] = useState("");
    const [registerCity, setRegisterCity] = useState("");
    const [registerName, setRegisterName] = useState("");
    const [registerEmail, setRegisterEmail] = useState("");
    const [registerPassword, setRegisterPassword] = useState("");

    const sendData = () => {
        const requestBody = JSON.stringify({
            email: registerEmail,
            password: registerPassword,
            companyType: selectedOptionCompanyType,
            typeOfService: selectedOptionTypeOfService,
            phoneNumber: registerPhoneNumber,
            name: registerName,
            city: registerCity,
            PIB: registerPIB,
        });
        console.log(requestBody);
    }

    return (
            <article className="br2 ba b--black-10 mv4 mw6 shadow-5 center"
                style={styles.form}>
                <main className="pa4 black-80">
                    <div className="measure">
                        <fieldset id="sign_up" className="ba b--transparent ph0 mh0">
                            <legend className="f3 fw6 ph0 mh0">Registruj se</legend>
                            <div className="mt3">
                                <label className="db fw6 lh-copy f6" htmlFor="name">Ime</label>
                                <input
                                    className="pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                    type="text"
                                    name="name"
                                    id="name"
                                    onChange={(e) => setRegisterName(e.target.value)}
                                />
                            </div>
                        <div className="mt3">
                            <label className="db fw6 lh-copy f6" htmlFor="PIB">PIB</label>
                            <input
                                className="pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                type="text"
                                name="PIB"
                                id="PIB"
                                onChange={(e) => setRegisterPIB(e.target.value)}
                            />
                        </div>
                            <div className="mt3">
                                <label className="db fw6 lh-copy f6" htmlFor="email-address">Email</label>
                                <input
                                className="pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                type="email"
                                name="email-address"
                                id="email-address"
                                onChange={(e) => setRegisterEmail(e.target.value)}
                                />
                            </div>
                            <div className="mt3">
                                <label className="db fw6 lh-copy f6" htmlFor="mobile-phone">Broj telefona</label>
                                <input
                                    className="pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                    type="text"
                                    name="mobile-phone"
                                    id="mobile-phone"
                                    onChange={(e) => setRegisterPhoneNumber(e.target.value)}
                                />
                            </div>
                            <div className="mt3">
                                <label className="db fw6 lh-copy f6" htmlFor="city">Grad</label>
                                <input
                                    className="pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                    type="text"
                                    name="city"
                                    id="city"
                                    onChange={(e) => setRegisterCity(e.target.value)}
                                />
                            </div>
                            <div className="mv3">
                                <label className="db fw6 lh-copy f6" htmlFor="password">Sifra</label>
                                <input
                                    className="b pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                    type="password"
                                    name="password"
                                    id="password"
                                    onChange={(e) => setRegisterPassword(e.target.value)}
                                />
                            </div>
                            <div className="mv3">
                                <label className="dib pa2">
                                    <input
                                        type="radio"
                                        name="radioGroup1"
                                        value="government"
                                        checked={selectedOptionCompanyType === 'government'}
                                        onChange={() => {setSelectedOptionCompanyType('government')}}
                                        className="mr2"
                                    />
                                    Drzavna ustanova
                                </label>
                                <label className="dib pa2">
                                    <input
                                        type="radio"
                                        name="radioGroup1"
                                        value="private-company"
                                        checked={selectedOptionCompanyType === 'private-company'}
                                        onChange={() => { setSelectedOptionCompanyType('private-company') }}
                                        className="mr2"
                                    />
                                    Privatna firma
                                </label>
                            </div>
                            <div className="mv3">
                                <label className="dib pa2">
                                    <input
                                        type="radio"
                                        name="radioGroup2"
                                        value="offer"
                                        checked={selectedOptionTypeOfService === 'offer'}
                                        onChange={() => { setSelectedOptionTypeOfService('offer') }}
                                        className="mr2"
                                    />
                                    Nudim uslugu
                                </label>
                                <label className="dib pa2">
                                    <input
                                        type="radio"
                                        name="radioGroup2"
                                        value="need"
                                        checked={selectedOptionTypeOfService === 'need'}
                                        onChange={() => { setSelectedOptionTypeOfService('need') }}
                                        className="mr2"
                                    />
                                    Potrebna usluga
                                </label>
                            </div>
                        </fieldset>
                        <div className="">
                            <input
                                className="b ph3 pv2 input-reset ba b--black bg-transparent grow pointer f6 dib"
                                type="submit"
                                value="Posalji"
                                onClick={() => setRoute('home')}
                            />
                        </div>
                    </div>
                </main>
            </article>
    );
}