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

export const SignIn = ({route, setRoute}) => {

    const [signInEmail, setSignInEmail] = useState('');
    const [signInPassword, setSignInPassword] = useState('');

    const sendData = () => {
        const requestBody = JSON.stringify({
            email: signInEmail,
            password: signInPassword
        });
        console.log(requestBody);
    }

    return (
        <article className="br2 ba b--black-10 mv4 mw6 shadow-5 center"
            style={styles.form}>
            <main className="pa4 black-80">
                <div className="measure">
                    <fieldset id="sign_up" className="ba b--transparent ph0 mh0">
                        <legend className="f3 fw6 ph0 mh0">Prijavi se</legend>
                        <div className="mt3">
                            <label className="db fw6 lh-copy f6" htmlFor="email-address">Email</label>
                            <input
                                className="pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                type="email"
                                name="email-address"
                                id="email-address"
                                onChange={(e) => setSignInEmail(e.target.value)}
                            />
                        </div>
                        <div className="mv3">
                            <label className="db fw6 lh-copy f6" htmlFor="password">Sifra</label>
                            <input
                                className="b pa2 input-reset ba bg-transparent hover-bg-black hover-white w-100"
                                type="password"
                                name="password"
                                id="password"
                                onChange={(e) => setSignInPassword(e.target.value)}
                            />
                        </div>
                    </fieldset>
                    <div className="">
                        <input
                            className="b ph3 pv2 input-reset ba b--black bg-transparent grow pointer f6 dib"
                            type="submit"
                            value="Posalji"
                            onClick={() => sendData()}
                        />
                    </div>
                    <div className="lh-copy mt3">
                        <p onClick={() => setRoute('register')} className="f6 link dim black db pointer">Registruj se</p>
                    </div>
                </div>
            </main>
        </article>
    );
}