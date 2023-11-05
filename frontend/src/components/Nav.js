import React from "react";

const styles = {
    nav: {
        color: 'black',
        position: 'fixed',
        top: 0,
        width: '100%',
        fontWeight: '600',
        zIndex: '1000'
    }
}

export const Nav = ({ route, setRoute, roleID }) => {
    if(route === 'register' || route === 'signIn')
        return (
            <nav className="flex justify-between bb b--black-10 black bg-blue shadow-2"
                style={styles.nav}>
                <div className="flex-grow pa3 flex items-center">
                    <span className="f5 link white dib dim mr3 mr4-ns"
                        onClick={() => setRoute('register')}>
                        Registracija
                    </span>
                    <span className="f5 link white dib dim mr3 mr4-ns"
                        onClick={() => setRoute('signIn')}>
                        Prijava
                    </span>
                </div>
            </nav>
        );
    else {
        if (roleID === 2) {
            return (
                <nav className="flex justify-between bb b--black-10 black bg-blue shadow-2"
                    style={styles.nav}>
                    <div className="flex-grow pa3 flex items-center">
                        <span className="f5 link white dib dim mr3 mr4-ns"
                            onClick={() => setRoute('home')}>
                            Oglasi
                        </span>
                        <span className="f5 link white dib dim mr3 mr4-ns"
                            onClick={() => setRoute('home')}>
                            Moj profil
                        </span>
                        <span className="f5 link white dib dim mr3 mr4-ns"
                            onClick={() => setRoute('signIn')}>
                            Odjavi se
                        </span>
                    </div>
                </nav>
            );
        }
    }
}