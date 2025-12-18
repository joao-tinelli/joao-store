import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import "./footer.css";

import { faHeart } from "@fortawesome/free-solid-svg-icons";

export default function Footer(){
    return (
        <footer className="footer">
            Built with 
            <FontAwesomeIcon icon={faHeart} className="footer-icon" aria-hidden="true"/>
            by
            <a href="https://github.com/joao-tinelli" target="_blank" rel="noreferrer">
            Joao Tinelli
            </a>
        </footer>
    );
}